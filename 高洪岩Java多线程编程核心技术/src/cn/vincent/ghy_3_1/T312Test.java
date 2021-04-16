package cn.vincent.ghy_3_1;

public class T312Test {
    public static void main(String[] args) {
        try {
            String name = new String("123");
            synchronized (name){

            }
            name.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
