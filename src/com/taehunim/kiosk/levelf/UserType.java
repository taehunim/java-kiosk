package com.taehunim.kiosk.levelf;

/**
* 사람의 타입에 따라 할인률을 정의한 Enum
 * 각 타입에 따른 할인률 정보를 저장하고 제공한다.
 * 각 상수 객체는 할인률을 인자로 가지고 있다.
 * 해당 할인률 정보를 제공하는 기능을 제공한다.
* */
public enum UserType {
    NATIONALMERIT(0.1),
    SOLDIER(0.05),
    STUDENT(0.03),
    CITIZEN(0.00);

    // 속성
    // 타입의 할인률
    private final double discountRate;

    // Enum 생성자
    private UserType(double discountRate) {
        this.discountRate = discountRate;
    }

    // 기능
    public double getDiscountRate() {
        return discountRate;
    }

}
