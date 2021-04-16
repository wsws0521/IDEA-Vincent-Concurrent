package cn.vincent.ghy_1_7;

/**
 * 不过还是建议 T5 抛异常
 * 向上逐层抛出，使事件得以传播
 */
public class T11StopByReturn extends Thread {
    @Override
    public void run() {
        while (true){
            if(this.isInterrupted()){
                System.out.println("run：俺被停止啦！");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        try {
            T11StopByReturn t = new T11StopByReturn();
            t.start();
            Thread.sleep(2000); // 主线程先等会儿
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
