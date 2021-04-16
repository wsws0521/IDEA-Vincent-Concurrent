package cn.vincent.ghy_3_1;

import java.io.PipedInputStream;

public class T3112ThreadRead extends Thread {
    private T3112ReadData readData;
    private PipedInputStream input;

    public T3112ThreadRead(T3112ReadData readData, PipedInputStream input) {
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        super.run();
        readData.readMethod(input);
    }
}
