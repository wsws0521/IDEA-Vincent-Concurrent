package cn.vincent.future;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
        // 执行一段任务代码，然后得到一个结果，并且返回
        System.out.println("模拟运行任务代码");
        // 默认任务代码运行一共耗时了500ms
        Thread.sleep(500);
        String result = "模拟返回结果";
        return result;
    }
}
