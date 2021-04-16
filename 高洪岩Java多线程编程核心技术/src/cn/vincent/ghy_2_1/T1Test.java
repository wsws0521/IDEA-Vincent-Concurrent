package cn.vincent.ghy_2_1;

public class T1Test {
    public static void main(String[] args) {
        T1MethodVarIsSafe object = new T1MethodVarIsSafe();
        T1ThreadA a = new T1ThreadA(object);
        a.start();
        T1ThreadB b = new T1ThreadB(object);
        b.start();
    }

}
