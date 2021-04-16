package cn.vincent.ghy_2_2;

public class T3ThreadA extends Thread {
    private T3Service t3Service;

    public T3ThreadA(T3Service t3Service) {
        this.t3Service = t3Service;
    }

    @Override
    public void run() {
        super.run();
        t3Service.setUsernamePassword("a", "aa");
    }
}
