package cn.vincent.ghy_2_1;

public class T1ThreadA extends Thread {
    private T1MethodVarIsSafe object;

    public T1ThreadA(T1MethodVarIsSafe object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.addI("a");
    }
}
