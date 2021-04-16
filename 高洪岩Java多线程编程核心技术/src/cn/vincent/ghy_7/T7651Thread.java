package cn.vincent.ghy_7;

public class T7651Thread extends Thread {
    String userName;

    public T7651Thread(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(userName.hashCode());
    }
}
