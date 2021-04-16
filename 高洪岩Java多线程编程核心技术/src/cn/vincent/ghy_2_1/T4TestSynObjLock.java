package cn.vincent.ghy_2_1;

/**
 * 证明：线程锁 = 对象
 * a 调用 对象的 同步方法 持有锁
 * b 调用 对象的 普通方法 异步不受影响
 * 不会出现争抢锁
 * 俩方法都加同步，就会争抢同一个对象锁
 */
public class T4TestSynObjLock {
    public static void main(String[] args) {
        T4MyObject object = new T4MyObject();
        T4ThreadA a = new T4ThreadA(object);
        a.setName("A");
        T4ThreadB b = new T4ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
