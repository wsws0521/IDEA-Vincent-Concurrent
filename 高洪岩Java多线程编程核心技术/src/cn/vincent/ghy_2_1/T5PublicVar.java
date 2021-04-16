package cn.vincent.ghy_2_1;

public class T5PublicVar {
    public String userName = "A";
    public String passWord = "AA";
    synchronized public void setValues(String u, String p){
        try {
            this.userName = u;
            Thread.sleep(5000);
            this.passWord = p;
            System.out.println("setValue method thread name=" + Thread.currentThread().getName() + " userName=" + userName + " passWord=" + passWord);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void getValue(){
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " userName=" + userName + " passWord=" + passWord);
    }
}
