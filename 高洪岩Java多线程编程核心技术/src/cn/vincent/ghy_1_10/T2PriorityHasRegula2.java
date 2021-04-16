package cn.vincent.ghy_1_10;

import java.util.Random;

/**
 * 优先级具有规则性
 */
public class T2PriorityHasRegula2 extends Thread {
    // T2PriorityHasRegula2
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("□□□□□ T2PriorityHasRegula2 use time=" + (endTime - beginTime));
    }
}
