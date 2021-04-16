package cn.vincent.ghy_4_1;

public class T413Test {
    public static void main(String[] args) {
        try {
            T413Service t413Service = new T413Service();
            T413ThreadA t413ThreadA = new T413ThreadA(t413Service);
            t413ThreadA.start();
            Thread.sleep(3000); // 确保线程A先跑
            t413Service.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
