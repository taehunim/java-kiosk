package com.taehunim.kiosk.levelfour;

import java.util.List;

/**
 * Menu는 MenuItem 객체들을 관리하는 class입니다.
 * Main에서 생성된 MenuItem 객체 collection을 생성자를 통해 주입받아 활용합니다.
 * 필드로 category를 가지고 있습니다.
 * 생성자를 통해 주입받아 활용합니다.
 * 각 category 별로 객체를 만들어 활용합니다.
 * category값을 반환하는 method를 가지고 있습니다.
 *
*/

public class Menu {

    // 속성
    private final List<MenuItem> menuItems;

    private final String category;

    // 생성자
    Menu (String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems= menuItems;
    }

    // 기능
    // category 필드 값을 반환하는 기능
    String getCategory () {
        return category;
    }
}
