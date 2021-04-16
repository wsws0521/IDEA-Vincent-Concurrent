package cn.vincent.ghy_4_1;

public class T413ThreadA extends Thread {
    T413Service t413Service;

    public T413ThreadA(T413Service t413Service) {
        this.t413Service = t413Service;
    }

    @Override
    public void run() {
        super.run();
        t413Service.await();
    }
}
