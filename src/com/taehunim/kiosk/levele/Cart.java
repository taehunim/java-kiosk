package com.taehunim.kiosk.levele;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<MenuItem> cartItem = new ArrayList<>();

    public void addCart (MenuItem menuItem) {
        cartItem.add(menuItem);
    }

    public void removeAllItem () {
        cartItem.clear();
    }

    public List<MenuItem> getCartItem () {
        return cartItem;
    }
}
