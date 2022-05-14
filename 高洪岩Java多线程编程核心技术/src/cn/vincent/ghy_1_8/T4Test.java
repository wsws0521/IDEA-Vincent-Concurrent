package cn.vincent.ghy_1_8;

/**
 * suspend 导致的数据不同步。类似T2
 */
public class T4Test {
    public static void main(String[] args) {
        try {
            // final只是说 myObject 不能被重新赋值  但是  T4MyObject  里面的属性值可以变化···
            final T4MyObject myObject = new T4MyObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    myObject.getT4Fuck().setFuck("aFuck");
                    myObject.printUsernamePassword();
                    myObject.setValue("a", "aa"); // 将会卡在这一步
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(500);

            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    myObject.printUsernamePassword();
                    myObject.getT4Fuck().setFuck("bFuck");
                    myObject.setValue("b", "bb");
                    myObject.printUsernamePassword();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
