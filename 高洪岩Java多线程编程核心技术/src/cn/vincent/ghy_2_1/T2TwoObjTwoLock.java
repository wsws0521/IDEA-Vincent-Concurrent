package cn.vincent.ghy_2_1;

public class T2TwoObjTwoLock {
    private int num = 0;
    synchronized public void addI(String userName){
        if(userName.equals("a")){
            try {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            num = 200;
            System.out.println("b set over!");
        }
        System.out.println(userName + " num=" + num);
    }
}
