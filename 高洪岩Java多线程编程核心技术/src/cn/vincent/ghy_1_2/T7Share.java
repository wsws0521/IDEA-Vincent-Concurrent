package cn.vincent.ghy_1_2;

/**
 * 共享数据的情况（非线程安全）5个Thread跑1个对象
 */
public class T7Share extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        // 此处不用for循环，因为使用同步后其他线程就得不到运行的机会了（会一直由一个线程减法运算）
    }

    public static void main(String[] args) {
        T7Share myThread = new T7Share();
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
