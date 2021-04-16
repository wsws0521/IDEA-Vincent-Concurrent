package cn.vincent.ghy_2_2;

public class T16MyService {
    private String lock = "123";
    public void method1(){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getContextClassLoader() + " start at " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getContextClassLoader() + " end at " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
