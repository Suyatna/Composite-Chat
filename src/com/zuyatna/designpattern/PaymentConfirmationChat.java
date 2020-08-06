package com.zuyatna.designpattern;

public class PaymentConfirmationChat implements Chat {

    private String orderNum;

    public void setOrderNum(String orderNum) {

        this.orderNum = orderNum;
    }

    @Override
    public String getResponseText() {

        return orderNum;
    }
}
