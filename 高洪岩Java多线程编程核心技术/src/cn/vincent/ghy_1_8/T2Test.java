package cn.vincent.ghy_1_8;

/**
 * 线程a暂停了，导致永占资源
 */
public class T2Test {
    public static void main(String[] args) {
        try {
            final  T2SynchronizedObject object = new T2SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000); // main先等你1秒钟

            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("thrad2启动了，但是进入不了方法");
                    System.out.println("因为printString方法被a线程锁定，并永远暂停了");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
