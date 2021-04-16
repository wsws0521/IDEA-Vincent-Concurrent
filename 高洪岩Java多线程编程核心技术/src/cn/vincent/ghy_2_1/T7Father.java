package cn.vincent.ghy_2_1;

public class T7Father {
    public int i = 10;
    synchronized public void fatherMethod(){
        try {
            i--;
            System.out.println("father print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
