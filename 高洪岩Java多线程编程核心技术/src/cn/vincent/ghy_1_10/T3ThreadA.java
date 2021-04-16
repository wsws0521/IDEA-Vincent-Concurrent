package cn.vincent.ghy_1_10;

public class T3ThreadA extends Thread {
    // T3ThreadA
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while(true){
            count++;
        }
    }
}
