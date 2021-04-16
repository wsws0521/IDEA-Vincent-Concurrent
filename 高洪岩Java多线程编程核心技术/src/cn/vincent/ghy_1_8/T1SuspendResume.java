package cn.vincent.ghy_1_8;

/**
 * 极易造成公共的同步对象的“独占”，导致其他线程无法访问公共同步对象，详见T2
 */
public class T1SuspendResume extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            i++; // 注意这个线程死循环，永远完成不了，所以main也跟着停不下来
        }
    }

    public static void main(String[] args) {
        try {
            // while 无限循环 i++
            T1SuspendResume myThread = new T1SuspendResume();
            myThread.start();
            Thread.sleep(5000);
            //A
            myThread.suspend();
            System.out.println("A=" + System.currentTimeMillis() + " i=" + myThread.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + " i=" + myThread.getI());
            //B
            myThread.resume();
            Thread.sleep(5000);
            //C
            myThread.suspend();
            System.out.println("B=" + System.currentTimeMillis() + " i=" + myThread.getI());
            Thread.sleep(5000);
            System.out.println("B=" + System.currentTimeMillis() + " i=" + myThread.getI());

            // ··· 因为 Thread-0:run 停不下来，所以 main 也停不下来，要手动停止
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
