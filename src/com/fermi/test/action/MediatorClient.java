package com.fermi.test.action;

import com.fermi.desigin.action.mediator.AbstractColleague;
import com.fermi.desigin.action.mediator.ColleagueA;
import com.fermi.desigin.action.mediator.ColleagueB;

public class MediatorClient {

    /**
     * 用一个中介者对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使耦合松散，而且可以独立地改变它们之间的交互。
     *
     * 1. 多个对象有交互，依赖会麻烦，甚至相互依赖。
     * 2. 依赖多了就无法解耦。
     * 3. 中介可以管理所有交互，那么所有合作方依赖中介，依赖简化。
     * 4. 与外观模式多个server对应一个client；中介模式中，本身即是client，也是server
     */
    public static void main(String[] args) {

        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();

        System.out.println("==========设置A影响B==========");
        collA.setNumber(1288, collB);
        System.out.println("collA的number值：" + collA.getNumber());
        System.out.println("collB的number值：" + collB.getNumber());

        System.out.println("==========设置B影响A==========");
        collB.setNumber(87635, collA);
        System.out.println("collB的number值：" + collB.getNumber());
        System.out.println("collA的number值：" + collA.getNumber());
    }

}
