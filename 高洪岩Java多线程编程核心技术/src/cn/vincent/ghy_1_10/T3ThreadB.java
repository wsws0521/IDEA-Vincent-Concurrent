package cn.vincent.ghy_1_10;

public class T3ThreadB extends Thread {
    // T3ThreadB
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
