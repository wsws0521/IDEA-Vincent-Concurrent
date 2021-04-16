package cn.vincent.ghy_3_1;

public class T314ThreadB extends Thread {
    Object lock;

    public T314ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                if(T314Service.getSize() != 5){
                    System.out.println("start wait() : " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("end wait() : " + System.currentTimeMillis());
                }
//                System.out.println("有元素了，线程B要退出了");
//                throw new InterruptedException();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
