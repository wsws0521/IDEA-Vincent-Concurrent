package cn.vincent.ghy_3_2;

import java.time.LocalTime;

public class T325ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("B start at:" + LocalTime.now());
            Thread.sleep(5000);
            System.out.println("B end at:" + LocalTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void bService(){
        System.out.println("bService run at:" + LocalTime.now());
    }
}
