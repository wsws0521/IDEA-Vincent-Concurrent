package cn.vincent.ghy_1_10;

/**
 * 优先级高的  很有可能先被执行，也不绝对（优先级相差比较近就可看出）！！
 * 反正与代码执行顺序无关
 * 甚至与Console打印顺序无关，Console只是打印先执行完run的
 * CPU尽量把资源让给优先级高的 线程
 */
public class T2Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            T2PriorityHasRegula t1 = new T2PriorityHasRegula();
            t1.setPriority(1);
            t1.start();
            T2PriorityHasRegula2 t2 = new T2PriorityHasRegula2();
            t2.setPriority(10);
            t2.start();
        }
    }
}
