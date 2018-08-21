package com.fermi.test.structure;

import com.fermi.desigin.structure.flyweight.Flyweight;
import com.fermi.desigin.structure.flyweight.FlyweightFactory;

public class FlyWeightClient {

    /**
     * 享元模式
     * 1. 元：最小的复用单位，一个特征值只有一个实例，比如String
     * 2. 享：即“元”是共享的，所有特征值相同的实例只有一个，所以是共享的。
     * 3. 有助于降低内存占用，但内存回收周期变长，释放控制也变复杂。
     * 4. 会使对象管理变得非常复杂，特别是共享的是引用类型的话。
     * <p>
     * 对象创建的外部函数，更原型模式很像，但数量截然不同，可变对象使用原型模式更加合适。
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");

        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }
}
