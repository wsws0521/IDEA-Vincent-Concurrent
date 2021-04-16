package cn.vincent.ghy_2_3;

public class T7ThreadA extends Thread {
    private T7Service t7Service;

    public T7ThreadA(T7Service t7Service) {
        this.t7Service = t7Service;
    }

    @Override
    public void run() {
        super.run();
        t7Service.methodRun();
    }
}
