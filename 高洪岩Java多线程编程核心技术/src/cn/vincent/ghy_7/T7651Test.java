package cn.vincent.ghy_7;

public class T7651Test {
    public static void main(String[] args) throws InterruptedException {
        T7651Thread thread1 = new T7651Thread(null);
        thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName() + " fucked fucked!");
                e.printStackTrace();
            }
        });
        thread1.start();

        Thread.sleep(5000);
        T7651Thread thread2 = new T7651Thread("Vincent");
        thread2.start();
    }
}
