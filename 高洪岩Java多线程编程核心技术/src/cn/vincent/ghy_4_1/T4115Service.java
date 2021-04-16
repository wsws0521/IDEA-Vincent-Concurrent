package cn.vincent.ghy_4_1;

import cn.vincent.utils.CommonUtils;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class T4115Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void waitMethod(){
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("wait begin:" + CommonUtils.getCurDateTime());
            condition.awaitUntil(calendarRef.getTime());
            System.out.println("wait end:" + CommonUtils.getCurDateTime());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void notifyMethod(){
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("notify begin:" + CommonUtils.getCurDateTime());
            condition.signalAll();
            System.out.println("notify end:" + CommonUtils.getCurDateTime());
        } finally {
            lock.unlock();
        }
    }
}
