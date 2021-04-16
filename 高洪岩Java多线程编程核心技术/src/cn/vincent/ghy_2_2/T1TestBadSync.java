package cn.vincent.ghy_2_2;

import cn.vincent.utils.CommonUtils;

/**
 * 注意变更T1Task里的代码
 * 看到沉降sync代码块的作用
 */
public class T1TestBadSync {
    public static void main(String[] args) {
        T1Task task = new T1Task();
        T1MyThread1 thread1 = new T1MyThread1(task);
        thread1.start();
        T1MyThread2 thread2 = new T1MyThread2(task);
        thread2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("耗时=" + CommonUtils.calcMaxDuration());
    }
}
