package cn.vincent.ghy_2_2;

public class T1Task {
    private String getData1;
    private String getData2;
//    public synchronized void doLongTimeTask(){
//        try {
//            System.out.println("begin task");
//            Thread.sleep(3000);
//            getData1 = "长时间处理任务后从远程返回的值1 threadName=" + Thread.currentThread().getName();
//            getData2 = "长时间处理任务后从远程返回的值2 threadName=" + Thread.currentThread().getName();
//            System.out.println(getData1);
//            System.out.println(getData2);
//            System.out.println("end task");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    // 使用“同步代码块”提高性能（两个线程同时等这个3000ms）sync外是异步，sync内是同步
    public void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);


            String privateGetData1 = "长时间处理任务后从远程返回的值1 threadName=" + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后从远程返回的值2 threadName=" + Thread.currentThread().getName();
            synchronized (this){
                getData1 = privateGetData1;
                getData2 = privateGetData2;
            }


            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
