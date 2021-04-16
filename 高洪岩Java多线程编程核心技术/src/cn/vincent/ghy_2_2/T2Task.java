package cn.vincent.ghy_2_2;

/**
 * 线程1一旦进入同步代码块
 * 线程2就开始等待，旁观了
 */
public class T2Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("no sync threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
            System.out.println("");
            synchronized (this){
                for (int j = 0; j < 100; j++) {
                    System.out.println("sync threadName=" + Thread.currentThread().getName() + "j=" + (j + 1));
                }
            }
        }
    }
}
