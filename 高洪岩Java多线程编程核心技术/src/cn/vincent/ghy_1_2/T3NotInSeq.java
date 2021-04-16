package cn.vincent.ghy_1_2;

/**
 * CPU执行线程的随机性
 */
public class T3NotInSeq extends Thread {

    public static void main(String[] args) {
        T3NotInSeq myThread = new T3NotInSeq();
        myThread.setName("myThread");
        myThread.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time= (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time= (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
