package cn.vincent.ghy_1_4;

/**
 * 活动状态=线程已经启动，尚未终止=存活
 */
public class T2IsAlive2 extends Thread {
    public T2IsAlive2() {
        System.out.println("T2IsAlive2---begin");
        // main 在构造本对象
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        // main 当然是存活状态
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        // 父类的名字应该是：Thread-0
        System.out.println("this.getName()" + this.getName());
        // 父类应该还没活
        System.out.println("this.isAlive()" + this.isAlive());
        System.out.println("T2IsAlive2---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        // 执行线程t1的名字 应该是A
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.currentThread().getName()=" + this.currentThread().getName());
        // 执行线程一定是跑起来了才会执行到这儿，所以是 true
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        // 父类的名字应该还是：Thread-0
        System.out.println("this.getName()=" + this.getName());
        // 父类？？应该也是 true 吧。结果是 false ！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("run---end");
    }

    public static void main(String[] args) throws InterruptedException {
        T2IsAlive2 myThread = new T2IsAlive2();
        Thread t1 = new Thread(myThread);
        // t1 现在当然是 false
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        // main 现在当然是 true
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}
