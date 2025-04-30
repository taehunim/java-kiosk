package com.taehunim.kiosk.levelf;

/*
* 사람의 타입에 따라 할인률 할당
* */

public enum UserType {
    NATIONALMERIT(0.10),
    SLDIER(0.05),
    STUDENT(0.03),
    CITIZEN(0.00);

    private final double discountRate;

    UserType(Double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
