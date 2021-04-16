package cn.vincent.ghy_1_7;

public class T7SleepWhenInterrupt extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("run : 先停止了再让我睡！进入catch，且状态会被清除！" + this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        T7SleepWhenInterrupt myThread = new T7SleepWhenInterrupt();
        myThread.start();
        myThread.interrupt();
        System.out.println("main end");
    }
}
