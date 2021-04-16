package cn.vincent.ghy_2_1;

/**
 * 证明：线程锁 = 对象
 */
public class T3TestSynObjLock {
    public static void main(String[] args) {
        T3MyObject object = new T3MyObject();
        T3ThreadA a = new T3ThreadA(object);
        a.setName("A");
        T3ThreadB b = new T3ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
