package com.fermi.test.structure;

import com.fermi.desigin.structure.proxy.AbstractObject;
import com.fermi.desigin.structure.proxy.ProxyObject;

public class ProxyClient {

    /**
     * 参考办理事情的委托人方式，老婆委托老公办事，因为他们都是家庭这个接口的子类型。
     *
     * 跟装饰者很像，但装饰者可以起来是不同的类型，只是fuction也可不同；而代理，不止类型相同，function也得相同
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
