package cn.vincent.future.completablefuture;

import org.junit.Test;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * Future 不能手动完成计算，子线程死了，future永远get不到值了
 * Future 调用 get 会阻塞等待，缺乏通知回调，也就不能链式调用多任务，也就意味着整合多个 future 结果很尴尬 只能借助 Executors.invokeAll ， 这都是“异步的烦恼”
 * Future 内部也没有异常处理
 * 其发自 前端 Promise --- 大神在1.8的Lambda里加了个 CompletableFuture 对象
 */
public class TestCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> stringCompletableFuture = new CompletableFuture<>();
    }

    @Test
    public void TestJDK7(){
        // JDK8 之前
        try {
            FutureTask<String> task = new FutureTask<>((Callable<String>) () ->{
                TimeUnit.SECONDS.sleep(2);
                return UUID.randomUUID().toString();
            });
            new Thread(task).start();
            System.out.println(task.get()); // 只能阻塞等待
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 复杂的需求 ： 两个task 合并
     * 复杂的需求 ： 两个task 有一个返回即可
     * 编排 + 串联
     */
    @Test
    public void TestJDK8CompletedFuture(){
        // CompletableFuture#completedFuture
        try {
            FutureTask<String> task = new FutureTask<>((Callable<String>) () ->{
                TimeUnit.SECONDS.sleep(2);
                return UUID.randomUUID().toString();
            });
            new Thread(task).start();
            CompletableFuture<String> future = CompletableFuture.completedFuture(task.get()); // 其实也是阻塞等待
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void TestJDK8WhenComplete() {
        // CompletableFuture#whenComplete
        // 内部线程池，容易失控啊
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("子线程名称： " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
                System.out.println("");
                return UUID.randomUUID().toString();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        future.whenComplete((uuid, e) -> {
            // 自定义回调方法
            // 这里面不用 get 即可获得结果 等于还是子线程
            System.out.println(uuid);
            System.out.println("子线程名称： " + Thread.currentThread().getName());
        });

        System.out.println("主线程名称：" + Thread.currentThread().getName());
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void TestJDK8AnyWhenComplete() {
        // CompletableFuture#whenComplete
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("子线程1名称： " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(4);
                System.out.println("");
                return UUID.randomUUID().toString();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("子线程2名称： " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
                System.out.println("");
                return UUID.randomUUID().toString();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture.anyOf(future1, future2).whenComplete((uuid, e) -> {
            // 自定义回调方法
            // 这里面不用 get 即可获得结果 等于还是子线程
            System.out.println(uuid);
            System.out.println("子线程？名称： " + Thread.currentThread().getName());
        });

        System.out.println("主线程名称：" + Thread.currentThread().getName());
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
