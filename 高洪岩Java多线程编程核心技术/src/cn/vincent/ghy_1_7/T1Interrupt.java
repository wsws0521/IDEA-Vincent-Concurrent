package cn.vincent.ghy_1_7;

/**
 * 主动停止线程的三种方式：
 * ① 使用退出标志（当run完成后线程终止）
 * ② 强行终止，不推荐，已deprecated。（stop/suspend/resume）
 * ③ interrupt
 */
public class T1Interrupt extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i = " + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            T1Interrupt myThread = new T1Interrupt();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
