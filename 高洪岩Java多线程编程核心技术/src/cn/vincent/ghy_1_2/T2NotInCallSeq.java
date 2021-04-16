package cn.vincent.ghy_1_2;

/**
 * 执行顺序 与 调用顺序 无关
 */
public class T2NotInCallSeq extends Thread {

    public static void main(String[] args) {
        T2NotInCallSeq myThread = new T2NotInCallSeq();
        myThread.start();
//        myThread.start(); // IllegalThreadStateException
        System.out.println("运行结束");
    }
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
