package cn.vincent.ghy_3_3;

public class T332ThreadA extends Thread {
    @Override
    public void run() {
        try {
            super.run();
            for (int i = 0; i < 100; i++) {
                T332Tool.tl.set("A" + i);
                System.out.println(T332Tool.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
