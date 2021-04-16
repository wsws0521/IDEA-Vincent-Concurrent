package cn.vincent.ghy_4_1;

public class T4113Test {
    public static void main(String[] args) throws InterruptedException {
        final T4113Service service = new T4113Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt(); // 打标记
        System.out.println("main end");
    }
}
