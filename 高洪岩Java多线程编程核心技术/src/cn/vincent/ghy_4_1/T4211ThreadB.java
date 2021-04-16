package cn.vincent.ghy_4_1;

public class T4211ThreadB extends Thread {
    private T4211Service service;

    public T4211ThreadB(T4211Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
