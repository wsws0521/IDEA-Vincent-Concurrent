package cn.vincent.ghy_2_2;

public class T3Test {
    public static void main(String[] args) {
        T3Service t3Service = new T3Service();
        T3ThreadA t3ThreadA = new T3ThreadA(t3Service);
        t3ThreadA.setName("A");
        t3ThreadA.start();
        T3ThreadB t3ThreadB = new T3ThreadB(t3Service);
        t3ThreadB.setName("B");
        t3ThreadB.start();
    }
}
