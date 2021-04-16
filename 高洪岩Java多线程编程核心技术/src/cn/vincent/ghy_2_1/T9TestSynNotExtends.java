package cn.vincent.ghy_2_1;

/**
 * 验证：同步不具有继承性
 * A/B一起跑son，因为son没有继承父类的“同步”属性
 * A/B在进入father就开始排队了。
 */
public class T9TestSynNotExtends {
    public static void main(String[] args) {
        T9Son son = new T9Son();
        T9ThreadA a = new T9ThreadA(son);
        a.setName("A");
        a.start();
        T9ThreadB b = new T9ThreadB(son);
        b.setName("B");
        b.start();
    }
}
