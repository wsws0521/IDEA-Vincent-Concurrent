package cn.vincent.ghy_1_9;

/**
 * 放弃当前 CPU 资源/时间片，让给其他任务
 * 放弃时间不确定
 */
public class T1Yield extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
//            Thread.yield(); // 打开后明显变慢
            count = count+ (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒！");
        System.out.println(count);
    }

    public static void main(String[] args) {
        T1Yield t = new T1Yield();
        t.start();
    }
}
