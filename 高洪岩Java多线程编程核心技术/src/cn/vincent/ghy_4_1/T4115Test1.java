package cn.vincent.ghy_4_1;

public class T4115Test1 {
    public static void main(String[] args) {
        try {
            T4115Service service = new T4115Service();
            T4115ThreadA a = new T4115ThreadA(service);
            a.start();
            Thread.sleep(2000);
            T4115ThreadB b = new T4115ThreadB(service);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
