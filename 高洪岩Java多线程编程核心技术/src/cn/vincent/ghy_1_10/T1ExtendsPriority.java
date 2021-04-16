package cn.vincent.ghy_1_10;

/**
 * 线程优先级的继承特性(优先级一般都是0-10超了就报错)
 * A线程启动了B线程，那么他俩优先级就是一样的
 */
public class T1ExtendsPriority extends Thread {
    @Override
    public void run() {
        System.out.println("T1ExtendsPriority run priority=" + this.getPriority()); // = 5
        T1ExtendsPriority2 thread2 = new T1ExtendsPriority2();
        thread2.start(); // = 5
    }

    public static void main(String[] args) {
        T1ExtendsPriority t = new T1ExtendsPriority();
        t.start();
    }
}
