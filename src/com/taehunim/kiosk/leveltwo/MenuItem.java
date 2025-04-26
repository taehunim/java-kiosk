package com.taehunim.kiosk.leveltwo;

public class MenuItem {

    // 속성
    private final String bugerName;
    private final String bugerInfo;
    private final int bugerPrice;

    // 생성자
    MenuItem(String bugerName, int bugerPrice, String bugerInfo) {
        this.bugerName = bugerName;
        this.bugerPrice = bugerPrice;
        this.bugerInfo = bugerInfo;
    }

    // 기능
    // 저장한 이름을 꺼내주는 기능
    public String getBugerName() {
        return bugerName;
    }

    // 저장한 가격을 꺼내주는 기능
    public int getBugerPrice() {
        return bugerPrice;
    }

    // 저장한 설명을 꺼내주는 기능
    public String getBugerInfo() {
        return bugerInfo;
    }
}
