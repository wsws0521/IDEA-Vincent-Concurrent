package cn.vincent.hxjs.ch01;

/**
 *
 */
public class S002MyThread extends Thread {

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        super.run();
        System.out.println("my thread");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
