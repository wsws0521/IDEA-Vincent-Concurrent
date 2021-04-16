package cn.vincent.ghy_1_7;

public class T4BizByInterruptedStatus extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if(this.interrupted()){ // 判断为true之后，会【清除】状态
                System.out.println("已经是停止状态了！我要退出了！");
                break; // 这里只是跳出for循环而已，后面如果有业务会继续执行
            }
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) {
        try {
            T4BizByInterruptedStatus myThread = new T4BizByInterruptedStatus();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
