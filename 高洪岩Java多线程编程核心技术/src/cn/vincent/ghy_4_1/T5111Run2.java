package cn.vincent.ghy_4_1;

import cn.vincent.utils.CommonUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class T5111Run2 extends TimerTask {
    @Override
    public void run() {
        System.err.println("执行了,时间为: "+ CommonUtils.getCurDateTime());
    }

    public static void main(String[] args) {
        System.out.println("当前时间为: " + CommonUtils.getCurDateTime());
        Date time = CommonUtils.getPastTime(10);
        System.out.println("计划时间为: " + time);

        T5111Run2 myTask2 = new T5111Run2();
        Timer timer = new Timer();
        timer.schedule(myTask2, time);
    }
}
