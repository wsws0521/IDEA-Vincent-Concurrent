package cn.vincent.hxjs.ch01;

/**
 * 调用main的线程，是由JVM 创建的线程
 */
public class S001CallMainThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
