package cn.vincent.ghy_2_3;

public class T7Test {
    public static void main(String[] args) {
        try {
            T7Service t7Service = new T7Service();
            T7ThreadA aaa = new T7ThreadA(t7Service);
            aaa.start();
            Thread.sleep(1000);
            T7ThreadB bbb = new T7ThreadB(t7Service);
            bbb.start();
            System.out.println("called stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
