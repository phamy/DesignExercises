package com.fermi.test.action;

import com.fermi.desigin.action.state.ConcreteStateB;
import com.fermi.desigin.action.state.Context;
import com.fermi.desigin.action.state.State;

public class StateClient {

    /**
     * 状态模式，又称状态对象模式（Pattern of Objects for States），状态模式是对象的行为模式。
     *
     * 状态模式允许一个对象在其内部状态改变的时候改变其行为。这个对象看上去就像是改变了它的类一样。
     *
     * 1. 不同的对象具有不同的状态。
     * 2. 状态机负责管理状态，并触发状态的行为。
     * 3. 跟组合模式是多种子类一起管理，用户并不关心细节；状态模式下，恰好关心的是状态所对应的行为。
     */
    public static void main(String[] args) {
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }
}
