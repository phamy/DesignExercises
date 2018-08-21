package com.fermi.test.creator;

import com.fermi.desigin.creator.builder.Builder;
import com.fermi.desigin.creator.builder.ConcreteBuilder;
import com.fermi.desigin.creator.builder.Director;
import com.fermi.desigin.creator.builder.Product;

public class BuilderClient {

    /**
     * 多种相关对象的一次性创建，分开创建就是将修改点分散，开闭原则的修改当然越少越好。
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
