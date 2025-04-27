package com.taehunim.kiosk.advancedlevelzero;

import java.util.List;
import java.util.Map;

public class Menu {

    // 속성
    private String category;

    List<MenuItem> menuItems;

    // 생성자
    Menu(MenuSelector menuSelector) {
        this.menuItems = menuSelector.getMenuItems();
    }
}
