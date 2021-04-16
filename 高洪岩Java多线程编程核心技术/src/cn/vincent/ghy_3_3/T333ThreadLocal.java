package cn.vincent.ghy_3_3;

import java.util.Date;

public class T333ThreadLocal extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "Im initValue, not null any more";
    }
}
