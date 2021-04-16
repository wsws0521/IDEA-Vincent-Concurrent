package cn.vincent.ghy_4_1;

public class T419Test {
    public static void main(String[] args) {
        final T419Service t419Service = new T419Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★线程" + Thread.currentThread().getName() + "运行了");
                t419Service.serviceMethod();
            }
        };
        Thread[] threadLs = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadLs[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadLs[i].start();
        }
    }
}
