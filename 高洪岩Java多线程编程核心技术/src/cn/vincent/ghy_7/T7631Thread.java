package cn.vincent.ghy_7;

public class T7631Thread extends Thread {
    Object lock;
    String showChar;
    int showNumberPosition;
    int printCount = 0; // 控制打印3组
    volatile static int addNumber = 1;

    public T7631Thread(Object lock, String showChar, int showNumberPosition) {
        this.lock = lock;
        this.showChar = showChar;
        this.showNumberPosition = showNumberPosition;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                while(true){
                    if(addNumber % 3 == showNumberPosition){
                        System.out.println(Thread.currentThread().getName() + "-" + addNumber + "-" + showChar);
                        lock.notifyAll();
                        addNumber ++;
                        printCount ++; // 控制打印3组
                        if(printCount == 3){ // 控制打印3组
                            break;
                        }
                    }else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
