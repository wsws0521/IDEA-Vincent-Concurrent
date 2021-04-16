package cn.vincent.ghy_3_1;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class T311Test {
    private final static Executor executor = Executors.newCachedThreadPool();
    public static void main(String[] args) {

        T311Service t311Service = new T311Service();
//
//        T311ThreadA aaa = new T311ThreadA(t311Service);
//        T311ThreadB bbb = new T311ThreadB(t311Service);
//        for (int i = 0; i <= 3 ; i++) {
//            executor.execute(aaa);
//            executor.execute(bbb);
//        }

        T311ThreadA aaa = new T311ThreadA(t311Service);
        aaa.setName("A");
        aaa.start();

        T311ThreadB bbb = new T311ThreadB(t311Service);
        bbb.setName("B");
        bbb.start();
    }
}
