package cn.vincent.ghy_3_2;

public class T325ThreadA extends Thread {
    T325ThreadB t325ThreadB;

    public T325ThreadA(T325ThreadB t325ThreadB) {
        this.t325ThreadB = t325ThreadB;
    }

    @Override
    public void run() {
        super.run();
        synchronized (t325ThreadB){
            try {
                t325ThreadB.start();
//                Thread.sleep(8000); // 不释放锁
                t325ThreadB.join(); // 释放
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
