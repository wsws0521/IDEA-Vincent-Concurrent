package cn.vincent.ghy_2_1;

public class T3ThreadB extends Thread {
    private T3MyObject object;

    public T3ThreadB(T3MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
