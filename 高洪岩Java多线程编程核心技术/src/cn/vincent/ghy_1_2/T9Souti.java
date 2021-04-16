package cn.vincent.ghy_1_2;

/**
 *
 */
public class T9Souti extends Thread {
    private int i = 5;
    @Override
    public void run() {
        // i--直接放入sout打印，而非独占一行
        // 虽然println()方法内部是 同步的
        // 但是 i-- 操作却是在进入 println() 之前发生的
        // 但是我并没有发现结果 出现非线程安全 的情况.....
        // System.out.println("i=" + (i--) + " ThreadName=" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        T9Souti run = new T9Souti();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
