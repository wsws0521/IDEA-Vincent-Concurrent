package cn.vincent.ghy_4_1;

public class T417ThreadGet extends Thread {
    T417Service t417Service = new T417Service();

    public T417ThreadGet(T417Service t417Service) {
        this.t417Service = t417Service;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            t417Service.get();
        }
    }
}
