package cn.vincent.ghy_1_2;

/**
 * 不共享数据的情况，三个线程各自递减自己的私有变量，互不影响
 */
public class T6NotShare extends Thread {
    private int count = 5;

    public T6NotShare(String name) {
        super();
        this.setName(name); // 设置线程名称
    }

    @Override
    public void run() {
        super.run();
        while (count > 0){
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        T6NotShare a = new T6NotShare("A");
        T6NotShare b = new T6NotShare("B");
        T6NotShare c = new T6NotShare("C");
        a.start();
        b.start();
        c.start();
    }
}
