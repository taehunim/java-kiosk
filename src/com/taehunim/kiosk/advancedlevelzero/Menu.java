package com.taehunim.kiosk.advancedlevelzero;

import java.util.List;
import java.util.Map;

public class Menu {

    // 속성
    private String category;

    private List<MenuItem> menuItems;

    // 생성자
    Menu(String category, MenuSelector menuSelector) {
        this.category = category;
        this.menuItems = menuSelector.getMenuItems();
    }

    // 기능

    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

}


