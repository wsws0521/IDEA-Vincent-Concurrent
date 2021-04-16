package cn.vincent.ghy_3_1;

public class T3111ThreadP extends Thread {
    private T3111P p;

    public T3111ThreadP(T3111P p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            p.setValue();
        }
    }
}
