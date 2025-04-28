package com.taehunim.kiosk.advancedlevelzero.menu;

public class MenuItem {

    // 속성
    private final String productName;
    private final String productInfo;
    private final int productPrice;

    // 생성자
    MenuItem(String productName, int productPrice, String productInfo) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productInfo = productInfo;
    }

    // 기능
    // getter를 통한 필드 데이터 가져오기

    public String getProductName() {
        return productName;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public int getProductPrice() {
        return productPrice;
    }
}
