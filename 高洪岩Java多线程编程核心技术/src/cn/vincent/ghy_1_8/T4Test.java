package cn.vincent.ghy_1_8;

/**
 * suspend 导致的数据不同步。类似T2
 */
public class T4Test {
    public static void main(String[] args) {
        try {
            final T4MyObject myObject = new T4MyObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    myObject.setValue("a", "aa");
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(500);

            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    myObject.printUsernamePassword();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
