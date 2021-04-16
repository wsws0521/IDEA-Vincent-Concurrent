package cn.vincent.ghy_4_1;

public class T4115ThreadA extends Thread {
    private T4115Service service;

    public T4115ThreadA(T4115Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.waitMethod();
    }
}
