package cn.vincent.ghy_2_2;

public class T15OutClass {
    static class T15InnerClass1{
        public void method1(T15InnerClass2 innerClassc2){
            String threadName = Thread.currentThread().getName();
            synchronized (innerClassc2){
                System.out.println(threadName + " 进入innerClass1.method1方法" );
                for (int i = 0; i < 10; i++) {
                    System.out.println("i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + " 离开innerClass1.method1方法" );
            }
        }
        public synchronized void method2(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入innerClass1.method2方法" );
            for (int j = 0; j < 10; j++) {
                System.out.println("j=" + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " 离开innerClass1.method2方法" );
        }
    }
    static class T15InnerClass2{
        public synchronized void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入innerClass2.method1方法" );
            for (int k = 0; k < 10; k++) {
                System.out.println("k=" + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " 离开innerClass2.method1方法" );
        }
    }
}
