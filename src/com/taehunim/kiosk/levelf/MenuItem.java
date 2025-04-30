package com.taehunim.kiosk.levelf;

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

