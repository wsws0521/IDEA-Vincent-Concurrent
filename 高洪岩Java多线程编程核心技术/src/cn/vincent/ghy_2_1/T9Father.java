package cn.vincent.ghy_2_1;

public class T9Father {
    synchronized public void serviceMethod(){
        try {
            System.out.println("int father 下一步 sleep begin threadName=" + Thread.currentThread().getName() + " Time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int father 下一步 sleep end threadName=" + Thread.currentThread().getName() + " Time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
