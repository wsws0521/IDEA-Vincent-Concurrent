package cn.vincent.ghy_4_1;

import java.time.LocalTime;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T413Service {
    Lock myLock = new ReentrantLock();
    Condition condition = myLock.newCondition();
    public void await(){
        try {
            myLock.lock(); // 必须获取对象监视器先，否则报：IllegalMonitorStateException
            System.out.println("waiting时间：" + LocalTime.now());
            condition.await(); // 线程进入waiting状态
            System.out.println("await() 继续执行 B：" + LocalTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void signal(){
        try {
            myLock.lock(); // 必须获取对象监视器先，否则报：IllegalMonitorStateException
            System.out.println("signal时间：" + LocalTime.now());
            condition.signal(); // 线程进入waiting状态
            System.out.println("signal() 继续执行 B：" + LocalTime.now());
        } finally {
            myLock.unlock();
        }
    }
}
