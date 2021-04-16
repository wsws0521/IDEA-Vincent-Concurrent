package cn.vincent.ghy_2_3;

public class T7Service {
    volatile private boolean isRun = true;
    public void methodRun(){
        while (isRun) {
            // do sth
        }
        System.out.println("I stopped");
    }
    public void methodStop(){
        isRun = false;
    }
}
