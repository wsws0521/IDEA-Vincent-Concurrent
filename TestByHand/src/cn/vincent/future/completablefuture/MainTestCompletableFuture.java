package cn.vincent.future.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * Future 不能手动完成计算，子线程死了，future永远get不到值了
 * Future 调用 get 会阻塞等待，缺乏通知回调，也就不能链式调用多任务，也就意味着整合多个 future 结果很尴尬 只能借助 Executors.invokeAll ， 这都是“异步的烦恼”
 * Future 内部也没有异常处理
 * 其发自 前端 Promise --- 大神在1.8的Lambda里加了个 CompletableFuture 对象
 */
public class MainTestCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> stringCompletableFuture = new CompletableFuture<>();
    }
}
