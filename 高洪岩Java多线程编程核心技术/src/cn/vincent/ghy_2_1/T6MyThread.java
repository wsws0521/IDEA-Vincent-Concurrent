package cn.vincent.ghy_2_1;

public class T6MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        T6Service service  =new T6Service();
        service.service1();
    }
}
