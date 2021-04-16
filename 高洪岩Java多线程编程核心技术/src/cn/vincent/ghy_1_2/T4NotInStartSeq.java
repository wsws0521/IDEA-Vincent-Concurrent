package cn.vincent.ghy_1_2;

/**
 * 甚至跟start的顺序无关
 */
public class T4NotInStartSeq extends Thread {
    private int i;
    public T4NotInStartSeq(int i) {
        super();
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println(i);
    }


    public static void main(String[] args) {
        T4NotInStartSeq t1 = new T4NotInStartSeq(1);
        T4NotInStartSeq t2 = new T4NotInStartSeq(2);
        T4NotInStartSeq t3 = new T4NotInStartSeq(3);
        T4NotInStartSeq t4 = new T4NotInStartSeq(4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
