package cn.vincent.ghy_1_8;

public class T2SynchronizedObject {
    // T2SynchronizedObject
    synchronized public void printString(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a 线程被永久 suspend 了！");
            Thread.currentThread().suspend(); // 一旦线程a进来，就永久暂停
        }
        System.out.println("end");
    }
}
