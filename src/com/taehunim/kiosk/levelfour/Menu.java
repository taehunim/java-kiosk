package com.taehunim.kiosk.levelfour;

import java.util.List;

public class Menu {

    // 속성
    List<MenuItem> burgerMenuList;
    List<MenuItem> drinkMenuList;

    String category;

    // 생성자
    Menu (String category,
          List<MenuItem> burgerMenuList,
          List<MenuItem> drinkMenuList) {
        this.category = category;
        this.burgerMenuList = burgerMenuList;
        this.drinkMenuList = drinkMenuList;
    }

    // 기능
    // category 필드 값을 반환하는 기능
    String getCategory () {
        return category;
    }
}
