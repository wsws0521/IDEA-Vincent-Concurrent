package cn.vincent.ghy_3_1;

import java.util.ArrayList;
import java.util.List;

public class T311Service {
    private List list = new ArrayList<>();
    public void addEle(){
        list.add("Vincent");
    }
    public int getSize(){
        return list.size();
    }
}
