package cn.vincent.ghy_3_1;

public class T3113ThreadBakB extends Thread {
    T3113DBTools dbTools = new T3113DBTools();

    public T3113ThreadBakB(T3113DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backupB();
    }
}
