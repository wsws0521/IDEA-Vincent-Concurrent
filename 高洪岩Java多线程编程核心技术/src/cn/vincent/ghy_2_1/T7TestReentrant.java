package cn.vincent.ghy_2_1;

/**
 * 可重入性
 * 父子同锁
 * 详见圣经，里面讲的比较详细
 */
public class T7TestReentrant {
    public static void main(String[] args) {
        T7MyThread t = new T7MyThread();
        t.start();
    }
}
