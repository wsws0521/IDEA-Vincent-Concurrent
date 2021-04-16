package cn.vincent.ghy_2_1;

/**
 * 传说中的“脏读”
 * 读到了别人未提交的部分修改
 *
 * 解决方法：把get也加上同步，加入到set相同对象锁管理
 */
public class T5Test {
    public static void main(String[] args) {
        try {
            T5PublicVar publicVarRef = new T5PublicVar();
            T5ThreadA thread = new T5ThreadA(publicVarRef);
            thread.start();
            Thread.sleep(200); // Thread-0线程还没set完呢
            publicVarRef.getValue(); // main线程就去get
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
