package cn.vincent.ghy_2_3;

import java.util.concurrent.atomic.AtomicLong;

public class T6Service {
    public static AtomicLong aiRef = new AtomicLong();
    public void addNum(){
        System.out.println(Thread.currentThread().getName() + " 加了100之后的值是：" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
