package cn.vincent.ghy_3_2;

public class T325ThreadC extends Thread {
    T325ThreadB t325ThreadB;

    public T325ThreadC(T325ThreadB t325ThreadB) {
        this.t325ThreadB = t325ThreadB;
    }

    @Override
    public void run() {
        super.run();
        t325ThreadB.bService();
    }
}
