package com.fermi.test.creator;

import com.fermi.desigin.creator.builder.Builder;
import com.fermi.desigin.creator.builder.ConcreteBuilder;
import com.fermi.desigin.creator.builder.Director;
import com.fermi.desigin.creator.builder.Product;

public class BuilderClient {

    /**
     * 多种相关对象的一次性创建，分开创建就是将修改点分散，开闭原则的修改当然越少越好。
     * <p>
     * 适用场景：
     * 1. 需要生成的产品对象有复杂的内部结构，每一个内部成分本身可以是对象，也可以仅仅是一个对象（即产品对象）的一个组成部分。
     * 2. 需要生成的产品对象的属性相互依赖。建造模式可以强制实行一种分步骤进行的建造过程，因此，如果产品对象的一个属性必须在另一个属性被赋值之后才可以被赋值，使用建造模式是一个很好的设计思想。
     * 3. 在对象创建过程中会使用到系统中的其他一些对象，这些对象在产品对象的创建过程中不易得到。
     */
    public static void main(String[] args) {
        //建造模式
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
