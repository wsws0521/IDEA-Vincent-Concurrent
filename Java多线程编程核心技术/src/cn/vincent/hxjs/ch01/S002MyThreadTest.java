package cn.vincent.hxjs.ch01;

/**
 *  代码执行顺序 与 调用顺序无关了
 */
public class S002MyThreadTest {
    public static void main(String[] args) {
        Thread mythread = new S002MyThread();
        mythread.start();
        System.out.println("运行结束");
    }
}
