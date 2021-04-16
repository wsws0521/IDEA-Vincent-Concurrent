package cn.vincent.ghy_1_5;

/**
 * 活动状态=线程已经启动，尚未终止=存活
 */
public class T3Sleep2 extends Thread {

    @Override
    public void run() {
        System.out.println("run threadName=  " + this.currentThread().getName() + "  begin at " + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run threadName=  " + this.currentThread().getName() + "  end at " + System.currentTimeMillis());
    }

    public static void main(String[] args) throws InterruptedException {
        T3Sleep2 myThread = new T3Sleep2();
        System.out.println("begin=" + System.currentTimeMillis());
//        myThread.run(); // 就是在 main 线程里面跑
        myThread.start(); // 起另外单独的 Thread-0 跑
        System.out.println("end=" + System.currentTimeMillis());
    }
}
