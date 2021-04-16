package cn.vincent.ghy_1_11;

public class T1DaemonThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        while (true){
            try {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            T1DaemonThread t1 = new T1DaemonThread();
            t1.setDaemon(true);
            t1.start();
            Thread.sleep(5000);
            System.out.println("main 结束，t1 也将停止打印");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
