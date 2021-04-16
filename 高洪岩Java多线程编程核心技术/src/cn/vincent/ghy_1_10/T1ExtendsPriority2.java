package cn.vincent.ghy_1_10;

/**
 * 线程优先级的继承特性
 * A线程启动了B线程，那么他俩优先级就是一样的
 */
public class T1ExtendsPriority2 extends Thread {
    @Override
    public void run() {
        System.out.println("T1ExtendsPriority2 run priority=" + this.getPriority());
    }
}
