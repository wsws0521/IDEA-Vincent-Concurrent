package cn.vincent.ghy_3_3;

public class T331Test {
    public static ThreadLocal tl = new ThreadLocal();
    public static void main(String[] args) {
        if(tl.get() == null){
            System.out.println("not store yet");
            tl.set("123");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
