package cn.vincent.ghy_4_1;

public class T4211Test {
    public static void main(String[] args) {
        T4211Service service = new T4211Service();
        T4211ThreadA a = new T4211ThreadA(service);
        T4211ThreadB b = new T4211ThreadB(service);
        a.start();
        b.start();
    }
}
