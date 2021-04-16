package cn.vincent.jbfbcsz.list3_3;
//@ThreadSafe
public class SynchronizedPojo {
//    @GuardedBy("this")
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
