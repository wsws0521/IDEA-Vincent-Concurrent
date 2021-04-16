package cn.vincent.ghy_1_7;

/**
 * 演示 stop 释放锁资源的不良后果：数据不一致
 */
public class T10SynchronizedObject {
    private String userName = "a";
    private String passWord = "aa";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    synchronized public void printString(String userName, String passWord) {
        try {
            this.userName = userName;
            Thread.sleep(100000); // 这里模拟一坨逻辑，制造处理起来很棘手缓慢的感觉
            this.passWord = passWord;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
