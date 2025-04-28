package com.taehunim.kiosk.advancedlevelzero.menu;

import com.taehunim.kiosk.advancedlevelzero.menu.menuData.MenuData;

import java.util.List;

public class Menu {

    // 속성
    private final String category;
    private final MenuData menuData;
    private final List<MenuItem> menuDataList;

    // 생성자
    public Menu(String category, MenuData menuData) {
        this.category = category;
        this.menuData = menuData;
        menuDataList = menuData.menuDataOfProduct();
    }


    // 기능
    // 카테고리 값을 주는 기능
    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuDataList() {
        return menuDataList;
    }
}
