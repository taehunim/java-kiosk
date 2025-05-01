package com.taehunim.kiosk.levelf;

import java.util.ArrayList;
import java.util.List;

/**
 * 장바구니에 관련된 역할을 수행하는 클래스
 * 장바구니에 저장된 제품 객체를 담는 컬렉션을 필드로 가지고 있다.
 * 컬렉션 데이터를 넘겨주거나 데이터를 가공하여 처리하는 기능을 가지고 있다.
 * */
public class Cart {
    // 속성
    private final List<MenuItem> cartItem = new ArrayList<>();

    // 생성자

    // 기능
    // 카트 제품 추가
    public void addCart(MenuItem menuItem) {
        cartItem.add(menuItem);
    }


    // 카트 비우기
    public void clearCart() {
        cartItem.clear();
    }


    // 카트 컬렉션 데이터 넘겨주기
    public List<MenuItem> getCartItem() {
        return cartItem;
    }


    // 카트 제품들 가격 정보를 합산하여 제공
    public int totalPrice() {
        int totalPrice = 0;
        for (MenuItem item : cartItem) {
            totalPrice += item.getProductPrice();
        }
        return totalPrice;
    }
}

