package com.taehunim.kiosk.levelf;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // 속성
    private final List<CartItem> cartItems = new ArrayList<>();

    // 생성자

    // 기능
    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void clearCart() {
        cartItems.clear();
    }


}
