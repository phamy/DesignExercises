package com.fermi.test.structure;

import com.fermi.desigin.structure.decorator.Bird;
import com.fermi.desigin.structure.decorator.Fish;
import com.fermi.desigin.structure.decorator.Monkey;
import com.fermi.desigin.structure.decorator.TheGreatestSage;

public class DecoratorClient {

    /**
     * 装饰模式又名包装(Wrapper)模式。装饰模式以对客户端透明的方式扩展对象的功能，是继承关系的一个替代方案。
     * <p>
     * 1. 用一层皮装饰另外的内核
     * 2. 皮可以不同，内核也可以不同，都是在运行时确定的，不停的包装皮，比继承要灵活。
     * 3. 其实就是分层的最最简单实现，但会无端的增加理解的难度的。
     * 4. 当然不同的client的只理解其中某一层的时候，是有好处的。
     * <p>
     * 此模式，可以作为为接口隔离的生硬实现，虽然有利于多个client的理解，但好处的坏处同样明显。
     */
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);
        // 第二种写法
        //TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
    }
}
