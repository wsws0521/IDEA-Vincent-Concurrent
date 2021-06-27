package cn.vincent.threadpool;

import java.util.concurrent.Executor;

/**
 * 自定义一个执行器（每个任务进来都启新线程）
 */
public class ThreadPerTaskExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
