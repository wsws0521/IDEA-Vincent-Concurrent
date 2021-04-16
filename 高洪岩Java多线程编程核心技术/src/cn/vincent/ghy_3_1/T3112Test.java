package cn.vincent.ghy_3_1;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class T3112Test {
    public static void main(String[] args) {
        try {
            T3112WriteData writeData = new T3112WriteData();
            T3112ReadData readData = new T3112ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
//        inputStream.connect(outputStream);
            outputStream.connect(inputStream); // 使两个stream之间产生通信连接

            T3112ThreadRead t3112ThreadRead = new T3112ThreadRead(readData, inputStream);
            t3112ThreadRead.start();
            Thread.sleep(2000);

            T3112ThreadWrite t3112ThreadWrite = new T3112ThreadWrite(writeData, outputStream);
            t3112ThreadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
