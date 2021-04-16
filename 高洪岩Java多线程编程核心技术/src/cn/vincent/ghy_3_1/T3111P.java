package cn.vincent.ghy_3_1;

public class T3111P {
    private String lock;

    public T3111P(String lock) {
        this.lock = lock;
    }
    public void setValue(){
        try {
            synchronized (lock){
                if(!T3111ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是 " + value);
                T3111ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
