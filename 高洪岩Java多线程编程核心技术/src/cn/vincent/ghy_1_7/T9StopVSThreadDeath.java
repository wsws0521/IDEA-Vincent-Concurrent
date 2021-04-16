package cn.vincent.ghy_1_7;

/**
 * 调用Stop会抛出java.lang.ThreadDeath 异常，无需显式捕捉
 */
public class T9StopVSThreadDeath extends Thread {
    private int i = 0;
    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("run：进入了 catch 方法！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        T9StopVSThreadDeath myThread = new T9StopVSThreadDeath();
        myThread.start();
        System.out.println("main end");
    }
}
