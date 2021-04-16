package cn.vincent.ghy_3_1;

public class T3113Test {
    public static void main(String[] args) {
        T3113DBTools dbTools = new T3113DBTools();
        for (int i = 0; i < 20; i++) {
            T3113ThreadBakA bakA = new T3113ThreadBakA(dbTools);
            bakA.start();

            T3113ThreadBakB bakB = new T3113ThreadBakB(dbTools);
            bakB.start();
        }
    }
}
