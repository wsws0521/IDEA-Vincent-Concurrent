package cn.vincent.ghy_1_2;

/**
 *
 */
public class T8BLogin extends Thread {
    @Override
    public void run() {
        T8LoginServlet.doPost("b", "bb");
    }
}
