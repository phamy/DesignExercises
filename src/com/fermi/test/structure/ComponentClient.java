package com.fermi.test.structure;

import com.fermi.desigin.structure.component.Composite;
import com.fermi.desigin.structure.component.Leaf;

public class ComponentClient {

    /**
     * 当发现需求中是体现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考虑组合模式了。
     *
     * 1. 此模式可以作为多态、里氏替换的注解
     * 2. 虽然子类有不同的实现，但对外的使用接口client并不关心。
     * 3. 将所有同组类，合在一起使用统一的对外特性，是为组合模式。
     */
    public static void mian(String[] args){
        // 构造根节点
        Composite rootComposite = new Composite();
        rootComposite.name = "根节点";

        // 左节点
        Composite compositeLeft = new Composite();
        compositeLeft.name = "左节点";

        // 构建右节点，添加两个叶子几点，也就是子部件
        Composite compositeRight = new Composite();
        compositeRight.name = "右节点";
        Leaf leaf1 = new Leaf();
        leaf1.name = "右-子节点1";
        Leaf leaf2 = new Leaf();
        leaf2.name = "右-子节点2";
        compositeRight.add(leaf1);
        compositeRight.add(leaf2);

        // 左右节点加入 根节点
        rootComposite.add(compositeRight);
        rootComposite.add(compositeLeft);
        // 遍历组合部件
        rootComposite.eachChild();
    }
}
