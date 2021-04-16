package cn.vincent.ghy_2_2;

import cn.vincent.utils.CommonUtils;

public class T2MyThread1 extends Thread {
    private T2Task task;

    public T2MyThread1(T2Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
