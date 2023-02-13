package cn.vincent.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class MainTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 基于我们自己写的任务代码，构建一个FutureTask，其实就是把我们自己的 task 包装了一层
        FutureTask<String> futureTask = new FutureTask<String>(new Task());
        // 构建一个线程池，线程池里会有一个真正运行任务的线程的
        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        // 把FutureTask任务提交到线程池里去，让线程池里的线程运行我们的任务代码
        threadPool.submit(futureTask);

        // 这个地方我们可以模拟干了一些别的事情，执行了很多别的代码，过了一段时间
        Thread.sleep(1000);

        // 过了一段时间以后，线程池里的线程应该运行完毕我们提交的任务代码了
        // 此时就可以通过FutureTask来获取到那个任务代码运行后的结果
        System.out.println(futureTask.get());
    }
}
