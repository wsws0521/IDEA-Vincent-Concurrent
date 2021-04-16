package cn.vincent.ghy_2_1;

public class T5ThreadA extends Thread {
    private T5PublicVar publicVar;

    public T5ThreadA(T5PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValues("B", "BB");
    }
}
