package cn.vincent.jbfbcsz.list3_11;

import java.util.HashSet;
import java.util.Set;

/**
 * 在可变对象的基础上构建不可变的类
 */
public final class ThreeStooges {
    private final Set<String> stooges = new HashSet<>();

    public ThreeStooges() {
        stooges.add("Moe");
        stooges.add("Larry");
        stooges.add("Curly");
    }

    public boolean isStooge(String name) {
        stooges.add("wushuai");
        return stooges.contains(name);
    }
}
