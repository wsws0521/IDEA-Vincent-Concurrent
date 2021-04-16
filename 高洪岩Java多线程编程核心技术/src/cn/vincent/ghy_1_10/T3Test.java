package cn.vincent.ghy_1_10;

/**
 * 看谁运行的快
 * 优先级更高的运行的更快，其实也没快多少啊
 */
public class T3Test {
    public static void main(String[] args) {
        try {
            T3ThreadA a = new T3ThreadA();
            a.setPriority(Thread.NORM_PRIORITY - 3);
            a.start();

            T3ThreadB b = new T3ThreadB();
            b.setPriority(Thread.NORM_PRIORITY + 3);
            b.start();

            Thread.sleep(10000);
            a.stop();
            b.stop();
            System.out.println("a=" + a.getCount());
            System.out.println("b=" + b.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
