package cn.vincent.ghy_1_2;

/**
 *
 */
public class T8TestUnsafe {

    public static void main(String[] args) {
        T8ALogin a = new T8ALogin();
        a.start();
        T8BLogin b = new T8BLogin();
        b.start();
    }

}
