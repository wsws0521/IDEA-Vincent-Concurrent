package cn.vincent.ghy_2_1;

public class T4ThreadA extends Thread {
    private T4MyObject object;

    public T4ThreadA(T4MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
