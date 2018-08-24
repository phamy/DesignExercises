package com.fermi.test.action;

import com.fermi.desigin.action.visitor.*;

public class VisitorClient {

    /**
     * 访问者模式是对象的行为模式。访问者模式的目的是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。
     * <p>
     * 优点：
     * 1. 能够在不修改对象结构中的元素的情况下，为对象结构中的元素添加新的功能。
     * 2. 可以通过访问者来定义整个对象结构通用的功能，从而提高复用程度。
     * 3. 可以通过访问者来分离无关的行为，把相关的行为封装在一起，构成一个访问者，这样每一个访问者的功能都比较单一。
     * 缺点
     * 1. 不适用于对象结构中的类经常变化的情况，因为对象结构发生了改变，访问者的接口和访问者的实现都要发生相应的改变，代价太高。
     * 2. 访问者模式通常需要对象结构开放内部数据给访问者和ObjectStructrue，这破坏了对象的封装性。
     */
    public static void main(String[] args) {
        //创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加一个节点
        os.add(new NodeA());
        //给结构增加一个节点
        os.add(new NodeB());
        //创建一个访问者
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }

}
