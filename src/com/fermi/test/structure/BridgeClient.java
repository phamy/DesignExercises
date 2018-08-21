package com.fermi.test.structure;

import com.fermi.desigin.structure.bridge.AreaA;
import com.fermi.desigin.structure.bridge.AreaA2;
import com.fermi.desigin.structure.bridge.AreaB3;

public class BridgeClient {

    /**
     * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
     * <p>
     * 这是对开闭原则最好的注解
     * <p>
     * 1. 关键在于使用一个接口的成员包换多个接口类型
     * 2. 每个成员类型的具体对向可以自由变化；
     * 3. 不同不同的接口概念就是有不同的归属，需要一个桥梁关联起来一起打包对外使用，这个总接口就是桥（bridge）
     * 4. 正因为“桥”，所以各部分client是可见的，是跟外观模式的显著区别。
     */
    public static void main(String[] args) {
        AreaA a = new AreaA2();
        a.qiao = new AreaB3();
        a.fromAreaA();
        a.qiao.targetAreaB();
    }
}
