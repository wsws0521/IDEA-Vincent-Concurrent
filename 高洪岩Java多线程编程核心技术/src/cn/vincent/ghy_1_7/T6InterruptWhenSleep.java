package cn.vincent.ghy_1_7;

public class T6InterruptWhenSleep extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("run : 我在沉睡中被停止！进入catch，且状态会被清除！" + this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            T6InterruptWhenSleep myThread = new T6InterruptWhenSleep();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            // run 里面直接catch处理了，就到不了这里
            System.out.println("main catch 了 线程抛出的异常");
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
