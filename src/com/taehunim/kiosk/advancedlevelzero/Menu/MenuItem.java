package com.taehunim.kiosk.advancedlevelzero.Menu;

public class MenuItem {

    // 속성
    private final String productName;
    private final String productInfo;
    private final String productCategory;
    private final int productPrice;

    // 생성자
    MenuItem(String productName, String productInfo, String productCategory, int productPrice) {
        this.productName = productName;
        this.productInfo = productInfo;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
    }

    // 기능
    public String getProductName() {
        return productName;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductPrice() {
        return productPrice;
    }
}

