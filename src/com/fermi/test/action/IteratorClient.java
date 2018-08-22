package com.fermi.test.action;

import com.fermi.desigin.action.iterator.Aggregate;
import com.fermi.desigin.action.iterator.ConcreteAggregate;
import com.fermi.desigin.action.iterator.Iterator;

public class IteratorClient {

    /**
     * 　迭代子模式又叫游标(Cursor)模式，是对象的行为模式。迭代子模式可以顺序地访问一个聚集中的元素而不必暴露聚集的内部表象（internal representation）。
     *
     * 1. 各种就集合类提供对成员的遍历，就是最常用的实现。
     * 2. 集合类的内部结构差别很大，但迭代遍历并无太差差别。
     * 3. 对完全不同的东西，提供相似的共性，这就是多态的魅力。
     */
    public static void main(String[] args) {

        IteratorClient client = new IteratorClient();
        client.operation();
    }

    public void operation() {
        Object[] objArray = {"One", "Two", "Three", "Four", "Five", "Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem());
            it.next();
        }
    }
}
