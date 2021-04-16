package cn.vincent.ghy_2_1;

public class T7MyThread extends Thread {
    @Override
    public void run() {
        T7Son son = new T7Son();
        son.fatherMethod();
    }
}
