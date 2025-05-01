package com.taehunim.kiosk.levelf;

import java.util.List;

/**
 * 제품 하나 하나를 카테고리별로 묶은 컬렉션과 그 컬렉션의 카테고리를 저장하는 클래스
 * 카테고리와 컬렉션을 저장하고 제공하는 역할을 수행한다.
 * */
public class Menu {

    // 속성
    private final String category;
    private final List<MenuItem> menuItems;

    // 생성자
    Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    // 기능
    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}



