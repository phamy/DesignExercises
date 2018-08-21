package com.fermi.desigin.structure.decorator;

/**
 * 具体装饰角色“鸟儿”
 */
public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }
}
