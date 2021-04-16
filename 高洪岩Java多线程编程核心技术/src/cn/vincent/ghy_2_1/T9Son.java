package cn.vincent.ghy_2_1;

public class T9Son extends T9Father {
    @Override
    public void serviceMethod() {
        try {
            System.out.println("int son 下一步 sleep begin threadName=" + Thread.currentThread().getName() + " Time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int son 下一步 sleep end threadName=" + Thread.currentThread().getName() + " Time=" + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
