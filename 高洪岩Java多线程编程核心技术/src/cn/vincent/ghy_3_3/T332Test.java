package cn.vincent.ghy_3_3;

public class T332Test {
    public static void main(String[] args) {
        try {
            T332ThreadA t332ThreadA = new T332ThreadA();
            T332ThreadB t332ThreadB = new T332ThreadB();
            t332ThreadA.start();
            t332ThreadB.start();
            for (int i = 0; i < 100; i++) {
                T332Tool.tl.set("main:" + i);
                System.out.println(T332Tool.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
