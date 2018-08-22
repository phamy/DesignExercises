package com.fermi.desigin.action.mediator;

public class ColleagueA extends AbstractColleague {
    
    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number * 100);
    }
}
