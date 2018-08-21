package com.fermi.test.action;

import com.fermi.desigin.action.chain.ConcreteHandler;
import com.fermi.desigin.action.chain.Handler;

public class ChainClient {

    /**
     * 责任链模式
     * 1. 链条节需要以下特征：
     *      1）相同的驱动行为
     *      2）明确的结束机制
     *      3）下一个节点
     * 2. 可以事件驱动，也可以消息驱动。
     * 3. 执行过程类似递归。
     * 4. 最好消息机制，这样避免过深的调用堆栈。
     */
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }
}
