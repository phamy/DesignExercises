package com.fermi.test.action;

import com.fermi.desigin.action.interpreter.*;

public class InterpreterClient {

    /**
     * 解释器模式是类的行为模式。给定一个语言之后，解释器模式可以定义出其文法的一种表示，并同时提供一个解释器。客户端可以使用这个解释器来解释这个语言中的句子。
     *
     * 1. 首先需要定义简单文法，即元数据的含义。
     * 2. 对语句分词，对每一个词进行相应操作。
     * 3. 定义单个词含义简单，但多个词容易产生语音矛盾。
     *
     * 与命令行模式，如果命令带了参数，或者多个命令组合输入；就倾向于解释器？
     */
    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(true);
        ctx.assign(x, false);
        ctx.assign(y, true);

        Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
        System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
    }
}
