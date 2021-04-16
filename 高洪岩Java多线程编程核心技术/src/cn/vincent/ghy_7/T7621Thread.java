package cn.vincent.ghy_7;

public class T7621Thread extends Thread {
    public T7621Thread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread: " + Thread.currentThread().getName() + " ready to dead cycle...");
        while (!this.isInterrupted()){
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + " finished!.");
    }
}
