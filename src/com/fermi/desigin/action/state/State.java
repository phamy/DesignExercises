package com.fermi.desigin.action.state;

public interface State {
    /**
     * 状态对应的处理
     */
    void handle(String sampleParameter);
}
