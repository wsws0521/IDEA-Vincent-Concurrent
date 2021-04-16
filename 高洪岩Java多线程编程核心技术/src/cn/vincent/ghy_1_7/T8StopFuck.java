package cn.vincent.ghy_1_7;

/**
 * 暴力停止
 * ① 可能导致一些清理性的工作无法完成
 * ② 直接释放锁资源，有可能出现数据不一致 见T10
 */
public class T8StopFuck extends Thread {
    private int i = 0;
    @Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            T8StopFuck myThread = new T8StopFuck();
            myThread.start();
            Thread.sleep(8000); // 先让子弹飞一会儿
            myThread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
