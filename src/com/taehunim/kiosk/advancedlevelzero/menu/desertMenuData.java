package com.taehunim.kiosk.advancedlevelzero.menu;

import java.util.ArrayList;
import java.util.List;

public class desertMenuData implements MenuData{
    @Override
    public List<MenuItem> menuDataOfProduct() {
        List list = new ArrayList<>();
        list.add(new MenuItem(
                        "Vanilla Ice Cream",
                        "부드럽고 달콤한 바닐라 아이스크림",
                        2500
                )
        );
        list.add(new MenuItem(
                        "Chocolate Chip Cookie",
                        "바삭하고 진한 초콜릿칩이 가득한 쿠키",
                        2000
                )
        );
        list.add(new MenuItem(
                        "Cheesecake Slice",
                        "진한 크림치즈 맛의 부드러운 치즈케이크",
                        3500
                )
        );
        list.add(new MenuItem(
                        "Apple Pie",
                        "따끈하고 달콤한 애플파이",
                        2500
                )
        );
        return list;
    }
}