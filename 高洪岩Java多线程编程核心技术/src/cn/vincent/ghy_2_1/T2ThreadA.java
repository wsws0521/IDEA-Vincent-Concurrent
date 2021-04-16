package cn.vincent.ghy_2_1;

public class T2ThreadA extends Thread {
    private T2TwoObjTwoLock object;

    public T2ThreadA(T2TwoObjTwoLock object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.addI("a");
    }
}
