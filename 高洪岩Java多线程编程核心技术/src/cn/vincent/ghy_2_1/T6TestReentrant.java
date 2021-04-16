package cn.vincent.ghy_2_1;

/**
 * 测试内置锁的  重入性
 * 如果同一线程不能重入，会造成死锁
 */
public class T6TestReentrant {
    public static void main(String[] args) {
        T6MyThread t = new T6MyThread();
        t.start();
    }
}
