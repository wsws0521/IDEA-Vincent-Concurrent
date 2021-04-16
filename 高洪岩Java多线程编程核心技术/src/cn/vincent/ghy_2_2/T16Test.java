package cn.vincent.ghy_2_2;

public class T16Test {
    public static void main(String[] args) throws InterruptedException {
        T16MyService t16MyService = new T16MyService();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                t16MyService.method1();
            }
        }, "T1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t16MyService.method1();
            }
        }, "T2");

        t1.start();
        Thread.sleep(50); // 等t1进去改值
        t2.start();
    }
}
