package cn.vincent.ghy_2_1;

/**
 * 出现异常，锁自动释放
 * 线程a出错，释放service同步锁，线程b进入service对象
 */
public class T8TestReleaseLockWhenException {
    public static void main(String[] args) {
        try {
            T8Service service = new T8Service();
            T8ThreadA a = new T8ThreadA(service);
            a.setName("a");
            a.start();

            Thread.sleep(500);

            T8ThreadB b = new T8ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
