package cn.vincent.ghy_2_1;

public class T4ThreadB extends Thread {
    private T4MyObject object;

    public T4ThreadB(T4MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
