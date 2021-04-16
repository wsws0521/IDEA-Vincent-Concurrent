package cn.vincent.ghy_3_1;

public class T313Thread1 extends Thread {
    private Object lock;

    public T313Thread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                System.out.println("start wait time: " + System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait time: " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
