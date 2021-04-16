package cn.vincent.ghy_3_1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class T314Test {
    private final static Executor executor = Executors.newCachedThreadPool();
    public static void main(String[] args) {
        Object lock = new Object();

        T314ThreadB bbb = new T314ThreadB(lock);
        bbb.setName("B");
        bbb.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        T314ThreadA aaa = new T314ThreadA(lock);
        aaa.setName("A");
        aaa.start();
    }
}
