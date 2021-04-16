package cn.vincent.ghy_3_1;

public class T3111ThreadC extends Thread {
    private T3111C c;

    public T3111ThreadC(T3111C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            c.setValue();
        }
    }
}
