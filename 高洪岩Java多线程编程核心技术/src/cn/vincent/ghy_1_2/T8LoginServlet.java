package cn.vincent.ghy_1_2;

/**
 * 实现非线程安全（状态不一致）
 */
public class T8LoginServlet {
    private static String uasernameRef;
    private static String passwordRef;

    // synchronized
    synchronized public static void doPost(String username, String password){
        try {
            uasernameRef = username;
            if (username.equals("a")){
                Thread.sleep(5000); // 如果不加synchronized 沉睡时 uasernameRef 被其他线程篡改
            }
            passwordRef = password;
            System.out.println("username=" + uasernameRef + ", password=" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
