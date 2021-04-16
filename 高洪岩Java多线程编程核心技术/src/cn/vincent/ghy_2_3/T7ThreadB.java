package cn.vincent.ghy_2_3;

public class T7ThreadB extends Thread {
    private T7Service t7Service;

    public T7ThreadB(T7Service t7Service) {
        this.t7Service = t7Service;
    }

    @Override
    public void run() {
        super.run();
        t7Service.methodStop();
    }
}
