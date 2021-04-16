package cn.vincent.ghy_1_8;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 线程对象内使用了 println （内置synchronized）
 * 又使用 suspend，会导致永久持有同步锁
 */
public class T3SuspendHoldPrintln extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true){
            i++;
            System.out.println(i); // println最怕suspend
        }
    }

    public static void main(String[] args) {
        try {
            T3SuspendHoldPrintln t = new T3SuspendHoldPrintln();
            t.start();
            Thread.sleep(1000);
            t.suspend();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end"); // t永久持有一个同步锁，导致这一步永远到不了
    }
}
