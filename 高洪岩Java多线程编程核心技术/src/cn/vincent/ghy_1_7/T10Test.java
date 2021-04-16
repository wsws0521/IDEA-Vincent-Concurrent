package cn.vincent.ghy_1_7;

/**
 * 线程在set一个对象里的属性，活没干完呢，被stop
 */
public class T10Test {
    public static void main(String[] args) {
        try {
            T10SynchronizedObject object = new T10SynchronizedObject();
            T10MyThread thread = new T10MyThread(object);
            thread.start();
            Thread.sleep(500);// 主线程稍等
            thread.stop();
            System.out.println(object.getUserName() + " " + object.getPassWord());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
