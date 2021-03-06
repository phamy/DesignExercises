package com.fermi.test.structure;

import com.fermi.desigin.structure.facede.Facade;

public class FacadeClient {

    /**
     * w外观模式：隐藏了系统的复杂性，并向客户端提供了一个可以访问系统的接口。这种类型的设计模式属于结构性模式。为子系统中的一组接口提供了一个统一的访问接口，这个接口使得子系统更容易被访问或者使用。
     * <p>
     * 1. 作为分层思想的最简单体现
     * 2. BS架构的最原始形态，将所有功能作为服务统一对外。
     * 3. client不知道service后面的所有分类，这是跟桥接模式的最明显区别。
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
