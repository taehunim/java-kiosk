package com.taehunim.kiosk.advancedlevelzero.menu;

import java.util.List;

public class MenuItem {

    // 속성
    private final String productName;
    private final String productInfo;
    private final int productPrice;

    // 생성자
    public MenuItem(String productName, String productInfo, int productPrice) {
        this.productName = productName;
        this.productInfo = productInfo;
        this.productPrice= productPrice;
    }

    // 기능
    public String printProductName () {
        return productName;
    }

    public String printProductInfo () {
        return productInfo;
    }

    public int printProductPrice () {
        return productPrice;
    }
}
