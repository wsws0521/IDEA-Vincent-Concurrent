package cn.vincent.ghy_1_7;

/**
 * 非静态 boolean
 */
public class T3IsInterrupted extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i = " + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            T3IsInterrupted myThread = new T3IsInterrupted();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？ =" + myThread.isInterrupted()); // true 测试线程对象是否是中断状态，不会清除状态！
            System.out.println("是否停止2？ =" + myThread.isInterrupted()); // true 但是线程会继续执行下去，需要在线程里面判断，去停止执行
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
