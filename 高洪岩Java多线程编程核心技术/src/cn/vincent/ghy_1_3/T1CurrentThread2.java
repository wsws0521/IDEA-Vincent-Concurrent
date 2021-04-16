package cn.vincent.ghy_1_3;

public class T1CurrentThread2 extends Thread {

    public T1CurrentThread2() {
        System.out.println("T1CurrentThread2---begin");
        // 是 main 线程在构造当前对象
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        // 父类线程是第一个线程 Thread-0
        System.out.println("this.getName()=" + this.getName());
        System.out.println("T1CurrentThread2---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        // 因为被新的执行线程 t1 所执行，所以此处显示 t1 的名字
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.currentThread().getName()=" + this.currentThread().getName());
        // 父类线程是第一个线程 Thread-0
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run---end");
    }

    public static void main(String[] args) {
        T1CurrentThread2 myThread = new T1CurrentThread2();
        Thread t1 = new Thread(myThread);
//        t1.setName("A");
        t1.start();
    }
}
