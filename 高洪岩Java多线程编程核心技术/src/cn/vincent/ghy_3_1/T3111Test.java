package cn.vincent.ghy_3_1;

public class T3111Test {
    public static void main(String[] args) {
        String lock = new String("");
        T3111P p = new T3111P(lock);
        T3111C c = new T3111C(lock);
        T3111ThreadP tp = new T3111ThreadP(p);
        T3111ThreadC tc = new T3111ThreadC(c);
        tp.start();
        tc.start();
    }
}
