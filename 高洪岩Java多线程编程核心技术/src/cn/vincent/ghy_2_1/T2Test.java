package cn.vincent.ghy_2_1;

/**
 * 两个实例 = 两个对象锁
 * 结果是异步的
 * b并没有等a执行完
 */
public class T2Test {
    public static void main(String[] args) {
        T2TwoObjTwoLock obj1 = new T2TwoObjTwoLock();
        T2TwoObjTwoLock obj2 = new T2TwoObjTwoLock();
        T2ThreadA a = new T2ThreadA(obj1);
        a.start();
        T2ThreadB b = new T2ThreadB(obj2);
        b.start(); // b并没有等a执行完
    }

}
