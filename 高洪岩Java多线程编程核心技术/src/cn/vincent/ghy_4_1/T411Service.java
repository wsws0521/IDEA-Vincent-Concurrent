package cn.vincent.ghy_4_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T411Service {
    private Lock lock = new ReentrantLock();
    public void method1(){
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
