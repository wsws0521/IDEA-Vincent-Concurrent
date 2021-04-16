package cn.vincent.ghy_2_2;

public class T3Service {
    String userNameParam;
    String passWordParam;
    String anyString = new String();
    public void setUsernamePassword(String u, String p){
        try {
            synchronized (anyString){
                System.out.println("线程：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入代码块");
                userNameParam = u;
                Thread.sleep(3000);
                passWordParam = p;
                System.out.println("线程：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开代码块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
