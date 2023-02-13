package cn.vincent.countdownlatch;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class TestCountDownLatch {
    // new Thread(() -> {  线程池就是避免这种野生 创建方式 而已
    // THREAD_POOL.execute(() -> {
    private static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(10, 20, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000));
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");


    public static void main(String[] args) throws InterruptedException {
//        countDownLatch1();
        countDownLatch2();
    }

    /**
     * 场景1 让多个线程等待：模拟并发，让并发线程一起执行  让一组线程在指定时刻(秒杀时间)执行抢购
     */
    public static void countDownLatch1() throws InterruptedException {
        CountDownLatch countDownLatch1 = new CountDownLatch(1);

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    //准备完毕……运动员都阻塞在这，等待号令
                    countDownLatch1.await();
                    String parter = "【" + Thread.currentThread().getName() + "】";
                    System.out.println(parter + "开始执行于……" + getCurDateTime());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        Thread.sleep(2000);// 裁判准备发令
        countDownLatch1.countDown();// 发令枪：执行发令
    }

    /**
     * 让单个线程等待：多个线程(任务)完成后，进行汇总合并
     */
    public static void countDownLatch2() throws InterruptedException{
        CountDownLatch countDownLatch = new CountDownLatch(5);

        for (int i = 0; i < 5; i++) {
            final int index = i;
            new Thread(() -> {
                try {
                    Thread.sleep(1000 + ThreadLocalRandom.current().nextInt(1000));
                    System.out.println("finish" + index + Thread.currentThread().getName() + "at" + getCurDateTime());
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        countDownLatch.await();// 主线程在阻塞，当计数器==0，就唤醒主线程往下执行。
        System.out.println("主线程:在所有任务运行完成后，进行结果汇总");
    }
    public static String getCurDateTime(){
        return sdf.format(new Date(Long.parseLong(String.valueOf(System.currentTimeMillis()))));
    }

}
