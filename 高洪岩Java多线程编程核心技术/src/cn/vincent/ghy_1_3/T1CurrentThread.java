package cn.vincent.ghy_1_3;

public class T1CurrentThread extends Thread {

    public T1CurrentThread() {
        System.out.println("构造方法被它调用：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法被它调用：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        T1CurrentThread myThread = new T1CurrentThread();
        myThread.start(); // Thread-0 去运行 run
//        myThread.run(); // main 去运行 run
    }
}
