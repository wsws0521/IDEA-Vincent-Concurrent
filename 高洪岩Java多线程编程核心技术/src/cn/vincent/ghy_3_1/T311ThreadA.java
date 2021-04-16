package cn.vincent.ghy_3_1;

public class T311ThreadA extends Thread {
    private T311Service t311Service;

    public T311ThreadA(T311Service t311Service) {
        this.t311Service = t311Service;
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                t311Service.addEle();
                System.out.println("添加第" + (i + 1) + "个元素");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
