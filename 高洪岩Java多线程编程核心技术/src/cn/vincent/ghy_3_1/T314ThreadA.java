package cn.vincent.ghy_3_1;

public class T314ThreadA extends Thread {
    private Object lock;

    public T314ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    T314Service.addEle();
                    System.out.println("添加第" + (i + 1) + "个元素");
                    if (T314Service.getSize() == 5) {
                        lock.notify();
                        System.out.println("已发出通知");
                    }
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
