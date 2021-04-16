package cn.vincent.ghy_1_4;

/**
 * 活动状态=线程已经启动，尚未终止=存活
 */
public class T2IsAlive extends Thread {

    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        T2IsAlive myThread = new T2IsAlive();
        System.out.println("begin=" + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000); // 1秒钟内 myThread 铁定跑完了
        System.out.println("end=" + myThread.isAlive());
    }
}
