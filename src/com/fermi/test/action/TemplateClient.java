package com.fermi.test.action;

import com.fermi.desigin.action.template.Account;
import com.fermi.desigin.action.template.CDAccount;
import com.fermi.desigin.action.template.MoneyMarketAccount;

public class TemplateClient {

    /**
     * 模板方法模式是类的行为模式。准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑。
     * 不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。这就是模板方法模式的用意。
     *
     * 1. 最常用的抽象类实现方法
     * 2. 父类实现总体流程控制，子类实现差异化细节。
     *
     * @param args
     */
    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }
}
