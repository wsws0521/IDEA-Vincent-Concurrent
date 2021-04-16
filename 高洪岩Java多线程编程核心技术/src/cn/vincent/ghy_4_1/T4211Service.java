package cn.vincent.ghy_4_1;

import cn.vincent.utils.CommonUtils;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class T4211Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read(){
        try {
            try {
                lock.readLock().lock();
                System.out.println("hold readlock " + Thread.currentThread().getName() + CommonUtils.getCurDateTime());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
