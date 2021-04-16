package cn.vincent.ghy_1_8;

public class T4MyObject {
    // T4MyObject
    private String userName = "1";
    private String passWord = "11";
    public void setValue(String u, String p){
        this.userName = u;
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("暂停a线程");
            Thread.currentThread().suspend();
        }
        this.passWord = p;
    }
    public void printUsernamePassword(){
        System.out.println(userName + " " + passWord);
    }
}
