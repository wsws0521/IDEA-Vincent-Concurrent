package cn.vincent.ghy_4_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class T4116Test {
    volatile private static int netStep = 1;
    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();
    public static void main(String[] args) {
        Thread A = new Thread(){
            @Override
            public void run() {
                try {
                    super.run();
                    lock.lock();
                    while (netStep != 1){
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadA:" + (i + 1));
                    }
                    netStep = 2;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread B = new Thread(){
            @Override
            public void run() {
                try {
                    super.run();
                    lock.lock();
                    while (netStep != 2){
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadB:" + (i + 1));
                    }
                    netStep = 3;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread C = new Thread(){
            @Override
            public void run() {
                try {
                    super.run();
                    lock.lock();
                    while (netStep != 3){
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ThreadC:" + (i + 1));
                    }
                    netStep = 1;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];
        for (int i = 0; i < 5; i++) {
            aArray[i] = new Thread(A);
            bArray[i] = new Thread(B);
            cArray[i] = new Thread(C);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }
    }
}
