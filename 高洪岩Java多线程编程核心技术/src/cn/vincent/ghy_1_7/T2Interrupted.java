package cn.vincent.ghy_1_7;

/**
 * 判断线程状态是不是interrupted
 */
public class T2Interrupted extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("i = " + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            T2Interrupted myThread = new T2Interrupted();  // 简单放一个for循环
            myThread.start();
            Thread.sleep(1000); // 等myThread跑起来
            myThread.interrupt();
//          Thread.currentThread().interrupt(); // 中断main，第一次看状态是true-【清除】，第二次就成了false

            System.out.println("是否停止1？ =" + myThread.interrupted()); // *.interrupted居然是判断“当前线程”是否已中断，“当前线程”是main！！！false
            System.out.println("是否停止2？ =" + myThread.interrupted()); // *.interrupted居然是判断“当前线程”是否已中断，“当前线程”是main！！！false
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
