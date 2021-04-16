package cn.vincent.ghy_7;

public class T7631Test {
    public static void main(String[] args) {
        Object lock = new Object();
        T7631Thread a = new T7631Thread(lock, "A", 1);
        T7631Thread b = new T7631Thread(lock, "B", 2);
        T7631Thread c = new T7631Thread(lock, "C", 0);
        a.start();
        b.start();
        c.start();
    }
}
