package cn.vincent.hxjs.ch01;

/**
 *  进一步体现main线程与mythread线程执行的随机性
 */
public class S003MyThreadTest {

    public static void main(String[] args) {
        try {
            S003MyThread mythread = new S003MyThread();
            mythread.setName("myThread");
            mythread.start();

            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
