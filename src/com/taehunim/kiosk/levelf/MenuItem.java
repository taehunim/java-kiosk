package com.taehunim.kiosk.levelf;

/**
* 메뉴 제품의 속성 정보를 가지고 있는 클래스
* 해당 클래스를 구현한 인스턴스들 하나하나가 메뉴들이다.
 * 메뉴들의 이름 가격 상세정보를 저장하고 제공하는 역할을 수행한다.
 * */
public class MenuItem {

    // 속성
    private final String productName;
    private final int productPrice;
    private final String productInfo;

    // 생성자
    public MenuItem(String productName, int productPrice, String productInfo) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productInfo = productInfo;
    }

    // 기능
    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getProductInfo() {
        return productInfo;
    }
}

