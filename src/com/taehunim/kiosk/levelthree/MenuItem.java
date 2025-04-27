package com.taehunim.kiosk.levelthree;

/**
 * kiosk의 음식 메뉴 정보를 제공하는 Menuitem class입니다.
 * 이름 , 정보, 가격 세가지 필드를 가지고 있습니다.
 * 생성자를 통해 이를 외부에서 주입받습니다.
 * getter를 통해 외부에 정보를 전달할 수 있습니다.
 */
public class MenuItem {

    // 속성
    private final String burgerName;
    private final String burgerInfo;
    private final int burgerPrice;

    // 생성자
    MenuItem(String burgerName, int burgerPrice, String burgerInfo) {
        this.burgerName = burgerName;
        this.burgerPrice = burgerPrice;
        this.burgerInfo = burgerInfo;
    }

    // 기능
    // 저장한 이름을 꺼내주는 기능
    public String getBurgerName() {
        return burgerName;
    }

    // 저장한 가격을 꺼내주는 기능
    public int getBurgerPrice() {
        return burgerPrice;
    }

    // 저장한 설명을 꺼내주는 기능
    public String getBurgerInfo() {
        return burgerInfo;
    }
}
