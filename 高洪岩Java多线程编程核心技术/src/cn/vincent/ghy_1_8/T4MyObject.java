package cn.vincent.ghy_1_8;

public class T4MyObject {
    T4Fuck t4Fuck = new T4Fuck();

    public void setT4Fuck(T4Fuck t4Fuck) {
        this.t4Fuck = t4Fuck;
    }

    public T4Fuck getT4Fuck() {
        return t4Fuck;
    }

    // T4MyObject
    private String userName = "1";
    private String passWord = "11";
    final String outFinal = t4Fuck.getFuck(); // class 的 final 变量  在class被实例化的时候即固定 = null
    public void setValue(String u, String p){
        this.userName = u;
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("暂停a线程");
            Thread.currentThread().suspend();
        }
        this.passWord = p;
    }
    public void printUsernamePassword(){
        // method 的 final 变量  如果只是为了确保线程安全 那么完全没意义  方法内的变量本来就是线程安全的
        final String innerFinal = t4Fuck.getFuck();

        if(Thread.currentThread().getName().equals("a")){
            System.out.println("暂停a线程");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(userName + " " + passWord + " " + outFinal + " " + innerFinal);

    }
}
