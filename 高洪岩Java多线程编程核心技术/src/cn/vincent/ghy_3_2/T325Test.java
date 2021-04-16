package cn.vincent.ghy_3_2;

public class T325Test {
    public static void main(String[] args) {
        try {
            T325ThreadB b = new T325ThreadB();
            T325ThreadA a = new T325ThreadA(b);
            a.start();
            Thread.sleep(1000);
            T325ThreadC c = new T325ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
