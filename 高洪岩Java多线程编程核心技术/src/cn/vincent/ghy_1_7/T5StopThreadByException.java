package cn.vincent.ghy_1_7;

public class T5StopThreadByException extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if(this.interrupted()){ // 判断为true之后，会【清除】状态
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException(); // 通过异常终止，简单粗暴
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我是for下面的其他业务代码");
        } catch (InterruptedException e) {
            System.out.println("我带着错误直接出来啦");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            T5StopThreadByException myThread = new T5StopThreadByException();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            // run 里面直接catch处理了，就到不了这里
            System.out.println("main catch 了 线程抛出的异常");
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
