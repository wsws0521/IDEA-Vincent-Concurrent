package cn.vincent.ghy_3_1;

public class T311ThreadB extends Thread {
    T311Service t311Service;

    public T311ThreadB(T311Service t311Service) {
        this.t311Service = t311Service;
    }

    @Override
    public void run() {

        int i = 0;
        super.run();
        try {
            while (true){
                if(t311Service.getSize() == 5){
                    System.out.println("有元素了，线程B要退出了");
                    throw new InterruptedException();
                }else {
                    i ++;
                }
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
