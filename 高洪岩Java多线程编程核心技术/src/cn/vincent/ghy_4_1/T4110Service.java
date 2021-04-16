package cn.vincent.ghy_4_1;

import java.util.concurrent.locks.ReentrantLock;

public class T4110Service {
    private ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("method1 got locks:" + lock.getHoldCount()); // 当前线程持有该锁的次数
            serviceMethod2();
        } finally {
            System.out.println("method1 got locks:" + lock.getHoldCount()); // 当前线程持有该锁的次数
            System.out.println("method1 unlock");
            lock.unlock();
        }
    }
    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println("method2 got locks:" + lock.getHoldCount()); // 当前线程持有该锁的次数
        } finally {
            System.out.println("method2 unlock");
            lock.unlock();
        }

    }
}
