package com.taehunim.kiosk.advancedlevelone;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // 속성
    List<MenuItem> cartItems = new ArrayList<>();

    // 생성자
    // 기본 생성자

    // 기능
    public void addcartitems (MenuItem menuItem) {
        cartItems.add(menuItem);
    }
    public int countTotalPrice (MenuItem menuItem) {
        int totalPrice = 0;
        for(MenuItem item : cartItems) {
            totalPrice += item.getProductPrice();
        }
        return totalPrice;
    }

    public void displayShoppingCart () {
        for (MenuItem item : cartItems) {
            System.out.println(
                    item.getProductName() +
                    item.getProductPrice() +
                    item.getProductInfo());
        }
    }
}
