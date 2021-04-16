package cn.vincent.ghy_7;

public class T7622Test {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup(); // 0
        ThreadGroup groupA = new ThreadGroup(mainGroup, "groupA");// 1
        ThreadGroup groupB = new ThreadGroup(groupA, "groupB");   // 2

        ThreadGroup[] groupsArray1 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groupsArray1, true);
        for (int i = 0; i < groupsArray1.length; i++) {
            System.out.println(groupsArray1[i].getName());
        }

        System.out.println("-----------------------------------------");

        ThreadGroup[] groupsArray2 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groupsArray2, false);
        for (int i = 0; i < groupsArray2.length; i++) {
            if (groupsArray2[i] != null)
                System.out.println(groupsArray2[i].getName());
        }
    }
}
