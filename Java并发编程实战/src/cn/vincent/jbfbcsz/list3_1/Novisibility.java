package cn.vincent.jbfbcsz.list3_1;

/**
 * 据说会时而不输出，时而输出0，但是并未发现可见性问题
 */
public class Novisibility {
    private static boolean ready;
    private static int number;
    // 读线程来读取
    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }
    // 主线程来写入
    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}


