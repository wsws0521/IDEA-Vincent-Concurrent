package cn.vincent.ghy_1_2;

/**
 * 如果一个类已经是子类，我们只能实现Runable接口
 */
public class T5MyRunable implements Runnable {

    @Override
    public void run() {
        System.out.println("运行中...");
    }

    public static void main(String[] args) {
        Runnable runnable = new T5MyRunable();
        Thread thread = new Thread(runnable); // 受Thread构造函数的启发，甚至传入一个Thread对象
        thread.start();
        System.out.println("运行结束！");
    }
}
