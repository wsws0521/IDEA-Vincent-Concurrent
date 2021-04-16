package cn.vincent.ghy_2_1;

/**
 * 如果是方法内部“私有变量”，那么就是安全的
 * 整个实例下的变量，才会存在“非线程安全问题”
 */
public class T1MethodVarIsSafe {
//    private int num = 0; // 实例下的变量，不安全（方法需要synchronized）
    public void addI(String userName){
        int num = 0; // 方法内的变量，安全
        if(userName.equals("a")){
            try {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            num = 200;
            System.out.println("b set over!");
        }
        System.out.println(userName + " num=" + num);
    }
}
