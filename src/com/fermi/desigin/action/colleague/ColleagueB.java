package com.fermi.desigin.action.colleague;

public class ColleagueB extends AbstractColleague {

    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number / 100);
    }
}
