package cn.vincent.ghy_4_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T417Service {
    private Lock myLock = new ReentrantLock();
    Condition condition = myLock.newCondition();
    private boolean hasValue = false;
    public void set(){
        try {
            myLock.lock();
            while (hasValue == true){
                System.out.println("possible together: ★★");
                condition.await();
            }
            System.out.println("set value: ★");
            hasValue = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            myLock.unlock();
        }
    }
    public void get(){
        try {
            myLock.lock();
            while (hasValue == false){
                System.out.println("possible together: ☆☆");
                condition.await();
            }
            System.out.println("get value: ☆");
            hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            myLock.unlock();
        }
    }
}
