package cn.vincent.ghy_4_1;

import cn.vincent.utils.CommonUtils;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class T5111Run1 {
    // true 代表设置成守护线程,否则无法停止
    private static Timer timer = new Timer();
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.err.println("runned ! at : " + CommonUtils.getCurDateTime());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Date theDate = CommonUtils.getTheDate("2021-04-08 11:25:00");
        timer.schedule(task, theDate);
    }
}
