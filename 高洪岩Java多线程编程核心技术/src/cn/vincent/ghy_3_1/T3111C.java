package cn.vincent.ghy_3_1;

public class T3111C {
    private String lock;

    public T3111C(String lock) {
        this.lock = lock;
    }
    public void setValue(){
        try {
            synchronized (lock){
                if(T3111ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值是 " + T3111ValueObject.value);
                T3111ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
