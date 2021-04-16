package cn.vincent.ghy_1_2;

/**
 * 仅仅 run 前加个 synchronized
 */
public class T7ShareSafe extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        // 此处不用for循环，因为使用同步后其他线程就得不到运行的机会了（会一直由一个线程减法运算）
    }

    public static void main(String[] args) {
        T7ShareSafe myThread = new T7ShareSafe();
        Thread a = new Thread(myThread,"A"); // 很骚的命名方法
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
