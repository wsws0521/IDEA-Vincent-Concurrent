package cn.vincent.ghy_3_4;

public class T341ThreadA extends Thread {
    @Override
    public void run() {
        try {
            super.run();
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadA get :" + T341Tool.t341InheritThreadLocalExt.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
