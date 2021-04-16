package cn.vincent.ghy_2_1;

public class T2ThreadB extends Thread {
    private T2TwoObjTwoLock object;

    public T2ThreadB(T2TwoObjTwoLock object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.addI("b");
    }
}
