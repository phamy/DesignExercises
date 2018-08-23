package com.fermi.test.action;

import com.fermi.desigin.action.observer.ConcreteObserver;
import com.fermi.desigin.action.observer.ConcreteSubject;
import com.fermi.desigin.action.observer.Observer;

public class ObserverClient {

    /**
     * 观察者模式是对象的行为模式，又叫发布-订阅(Publish/Subscribe)模式、模型-视图(Model/View)模式、源-监听器(Source/Listener)模式或从属者(Dependents)模式。
     *
     * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态上发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
     *
     * 1. 在界面编程中使用非常广泛的模式
     * 2. 所有的时间listener均是观察者
     * 3. 可以解耦事件的处理，是整体流程和细节处理能够分开
     */
    public static void main(String[] args) {
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
    }

}
