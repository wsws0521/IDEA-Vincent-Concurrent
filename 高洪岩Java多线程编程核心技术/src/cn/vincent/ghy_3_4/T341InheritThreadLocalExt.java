package cn.vincent.ghy_3_4;

import java.time.LocalTime;

public class T341InheritThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return LocalTime.now();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " 我在子线程加载的";
    }
}
