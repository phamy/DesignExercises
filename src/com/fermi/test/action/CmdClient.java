package com.fermi.test.action;

import com.fermi.desigin.action.command.Command;
import com.fermi.desigin.action.command.ConcreteCommand;
import com.fermi.desigin.action.command.Invoker;
import com.fermi.desigin.action.command.Receiver;

public class CmdClient {

    /**
     * 命令模式属于对象的行为模式。命令模式又称为行动(Action)模式或交易(Transaction)模式。
     * 命令模式把一个请求或者操作封装到一个对象中。命令模式允许系统使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
     *
     * 1. 首先命令是最容易扩展和通用的类型。
     * 2. 命令的执行者，并不需要太强的类型约束。
     * 3. 很好的实现的插件化的开发，很好实现了开闭原则、依赖倒置
     * 4. 由于命令行这个概念和抽象，但具体命令并不抽象，谈不上接口隔离？
     */
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }
}
