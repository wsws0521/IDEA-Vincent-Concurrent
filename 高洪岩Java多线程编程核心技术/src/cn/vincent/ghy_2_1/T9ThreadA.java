package cn.vincent.ghy_2_1;

public class T9ThreadA extends Thread {
    private T9Son son = new T9Son();

    public T9ThreadA(T9Son son) {
        this.son = son;
    }

    @Override
    public void run() {
        son.serviceMethod();
    }
}
