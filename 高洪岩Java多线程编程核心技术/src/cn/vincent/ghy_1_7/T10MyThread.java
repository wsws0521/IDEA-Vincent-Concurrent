package cn.vincent.ghy_1_7;

public class T10MyThread extends Thread {
    private T10SynchronizedObject object;

    public T10MyThread(T10SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.printString("b", "bb");
    }
}
