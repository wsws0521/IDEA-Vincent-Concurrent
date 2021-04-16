package cn.vincent.ghy_3_1;

public class T313Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            T313Thread1 t313Thread1 = new T313Thread1(lock);
            T313Thread2 t313Thread2 = new T313Thread2(lock);
            t313Thread1.start();
            Thread.sleep(3000);
            t313Thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
