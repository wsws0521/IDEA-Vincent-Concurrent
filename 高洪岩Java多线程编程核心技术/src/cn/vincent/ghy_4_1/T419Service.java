package cn.vincent.ghy_4_1;

import java.util.concurrent.locks.ReentrantLock;

public class T419Service {
    private ReentrantLock reentrantLock;

    public T419Service(boolean isFair) {
        reentrantLock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            reentrantLock.lock();
            System.out.println("ThreadName:" + Thread.currentThread().getName() + "获得service对象锁");
        } finally {
            reentrantLock.unlock();
        }
    }
}
