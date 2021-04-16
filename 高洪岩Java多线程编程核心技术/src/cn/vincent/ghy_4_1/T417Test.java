package cn.vincent.ghy_4_1;

public class T417Test {
    public static void main(String[] args) {
        T417Service t417Service = new T417Service();
        T417ThreadSet[] t417ThreadSetLs = new T417ThreadSet[10];
        T417ThreadGet[] t417ThreadGetLs = new T417ThreadGet[10];
        for (int i = 0; i < 10; i++) {
            t417ThreadSetLs[i] = new T417ThreadSet(t417Service);
            t417ThreadGetLs[i] = new T417ThreadGet(t417Service);
            t417ThreadSetLs[i].start(); // 不用sleep确保set先执行，service里面有保证
            t417ThreadGetLs[i].start();
        }
    }
}
