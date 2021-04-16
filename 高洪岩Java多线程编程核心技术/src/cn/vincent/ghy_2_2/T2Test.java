package cn.vincent.ghy_2_2;

public class T2Test {
    public static void main(String[] args) {
        T2Task task = new T2Task();
        T2MyThread1 thread1 = new T2MyThread1(task);
        thread1.start();
        T2MyThread2 thread2 = new T2MyThread2(task);
        thread2.start();
    }
}
