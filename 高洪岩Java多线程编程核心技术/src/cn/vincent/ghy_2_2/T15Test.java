package cn.vincent.ghy_2_2;

public class T15Test {
    public static void main(String[] args) {
        final T15OutClass.T15InnerClass1 in1 = new T15OutClass.T15InnerClass1();
        final T15OutClass.T15InnerClass2 in2 = new T15OutClass.T15InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        }, "T1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        }, "T2");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        }, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
