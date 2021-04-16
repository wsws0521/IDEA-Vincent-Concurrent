package cn.vincent.ghy_2_3;

public class T6Thread extends Thread {
    private T6Service t6Service;

    public T6Thread(T6Service t6Service) {
        this.t6Service = t6Service;
    }

    @Override
    public void run() {
        super.run();
        t6Service.addNum();
    }
}
