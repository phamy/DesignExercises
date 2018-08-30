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
     * <p>
     * 优点：
     * 1、装饰者模式可以提供比继承更多的灵活性
     * 2、可以通过一种动态的方式来扩展一个对象的功能，在运行时选择不同的装饰器，从而实现不同的行为。
     * 3、通过使用不同的具体装饰类以及这些装饰类的排列组合，可以创造出很多不同行为的组合。可以使用多个具体装饰类来装饰同一对象，得到功能更为强大的对象。
     * 4、具体构件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体构件类和具体装饰类，在使用时再对其进行组合，原有代码无须改变，符合“开闭原则”。
     * <p>
     * 缺点：
     * 1、会产生很多的小对象，增加了系统的复杂性
     * 2、这种比继承更加灵活机动的特性，也同时意味着装饰模式比继承更加易于出错，排错也很困难，对于多次装饰的对象，调试时寻找错误可能需要逐级排查，较为烦琐。
     * <p>
     * 适用场景：
     * 1、在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
     * 2、需要动态地给一个对象增加功能，这些功能也可以动态地被撤销。  当不能采用继承的方式对系统进行扩充或者采用继承不利于系统扩展和维护时。
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
