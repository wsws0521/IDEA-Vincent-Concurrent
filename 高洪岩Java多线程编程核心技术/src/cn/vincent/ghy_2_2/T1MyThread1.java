package cn.vincent.ghy_2_2;

import cn.vincent.utils.CommonUtils;

public class T1MyThread1 extends Thread {
    private T1Task task;

    public T1MyThread1(T1Task task) {
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
