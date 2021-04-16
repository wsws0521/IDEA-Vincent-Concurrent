package cn.vincent.ghy_7;

public class T7621Test {
    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup("myGroup");
            for (int i = 0; i < 5; i++) {
                T7621Thread thread = new T7621Thread(group, "Thread" + (i + 1));
                thread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("called group.interrupt");
        } catch (InterruptedException e) {
            System.out.println("fucked fucked");
            e.printStackTrace();
        }
    }
}
