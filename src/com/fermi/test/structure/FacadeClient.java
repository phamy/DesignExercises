package com.fermi.test.structure;

import com.fermi.desigin.structure.facede.Facade;

public class FacadeClient {

    /**
     * w外观模式：
     *
     * 1. 作为分层思想的最简单体现
     * 2. BS架构的最原始形态，将所有功能作为服务统一对外。
     * 3. client不知道service后面的所有分类，这是跟桥接模式的最明显区别。
     *
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
