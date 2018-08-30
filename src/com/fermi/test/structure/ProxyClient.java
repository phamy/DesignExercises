package com.fermi.test.structure;

import com.fermi.desigin.structure.proxy.AbstractObject;
import com.fermi.desigin.structure.proxy.ProxyObject;

public class ProxyClient {

    /**
     * 参考办理事情的委托人方式，老婆委托老公办事，因为他们都是家庭这个接口的子类型。
     * <p>
     * 跟装饰者很像，但装饰者可以起来是不同的类型，只是fuction也可不同；而代理，不止类型相同，function也得相同
     * <p>
     * 优点：
     * (1).职责清晰，真实的角色就是实现实际的业务逻辑，不用关心其他非本职责的事务，通过后期的代理完成一件完成事务，附带的结果就是编程简洁清晰。
     * (2).代理对象可以在客户端和目标对象之间起到中介的作用，这样起到了中介的作用和保护了目标对象的作用。
     * (3).高扩展性
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
