package cn.vincent.ghy_2_1;

public class T4MyObject {
    synchronized public void methodA(){ // 没有涉及共享资源读写，大可不必同步
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void methodB(){ // 没有涉及共享资源读写，大可不必同步
        try {
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName()
             + " begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
