package cn.vincent.ghy_3_1;

public class T313Thread2 extends Thread {
    private Object lock;

    public T313Thread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            System.out.println("start notify time: " + System.currentTimeMillis());
            lock.notify();
            System.out.println("end notify time: " + System.currentTimeMillis());
        }
    }
}
