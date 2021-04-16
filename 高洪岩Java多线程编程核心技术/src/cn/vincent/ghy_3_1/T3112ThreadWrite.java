package cn.vincent.ghy_3_1;

import java.io.PipedOutputStream;

public class T3112ThreadWrite extends Thread {
    private T3112WriteData writeData;
    private PipedOutputStream out;

    public T3112ThreadWrite(T3112WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        writeData.writeMethod(out);
    }
}
