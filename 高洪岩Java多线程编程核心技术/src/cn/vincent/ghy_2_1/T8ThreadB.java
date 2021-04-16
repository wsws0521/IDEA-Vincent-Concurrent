package cn.vincent.ghy_2_1;

public class T8ThreadB extends Thread {
    private T8Service service = new T8Service();

    public T8ThreadB(T8Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
