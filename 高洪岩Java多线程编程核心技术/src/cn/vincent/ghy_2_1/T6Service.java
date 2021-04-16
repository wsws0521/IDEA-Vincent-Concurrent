package cn.vincent.ghy_2_1;

public class T6Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized private void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized private void service3() {
        System.out.println("service3");
    }
}
