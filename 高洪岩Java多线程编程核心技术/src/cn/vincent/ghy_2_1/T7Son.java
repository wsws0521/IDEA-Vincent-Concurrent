package cn.vincent.ghy_2_1;

public class T7Son extends T7Father {
    @Override
    public synchronized void fatherMethod() {
//        super.fatherMethod();
        try {
            while(i > 0){
                i--;
                System.out.println("son print i=" + i);
                Thread.sleep(100);
                super.fatherMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
