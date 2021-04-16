package cn.vincent.ghy_3_4;

public class T341Test {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main get :" + T341Tool.t341InheritThreadLocalExt.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            T341ThreadA t341ThreadA = new T341ThreadA();
            t341ThreadA.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
