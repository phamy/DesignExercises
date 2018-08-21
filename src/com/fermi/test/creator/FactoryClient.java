package com.fermi.test.creator;

import com.fermi.desigin.creator.factory.ComputerEngineer;

public class FactoryClient {

    public static void main(String[] args) {
        //工厂模式
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1, 1);
    }
}
