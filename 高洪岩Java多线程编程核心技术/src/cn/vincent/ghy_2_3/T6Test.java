package cn.vincent.ghy_2_3;

public class T6Test {
    public static void main(String[] args) {
        try {
            T6Service t6Service = new T6Service();
            T6Thread[] array = new T6Thread[6];
            for (int i = 0; i < array.length; i++) {
                array[i] = new T6Thread(t6Service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(t6Service.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
