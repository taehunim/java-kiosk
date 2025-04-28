package com.taehunim.kiosk.advancedlevelzero.menu;

import java.util.ArrayList;
import java.util.List;

public class burgerMenuData implements MenuData {
    @Override
    public List<MenuItem> menuDataOfProduct() {
        List list = new ArrayList<>();
        list.add(new MenuItem(
                        "ShackBurger",
                        "토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                        6900
                )
        );
        list.add(new MenuItem(
                        "SmokeShack",
                        "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                        8900
                )
        );
        list.add(new MenuItem(
                        "Cheeseburger",
                        "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                        6900
                )
        );
        list.add(new MenuItem(
                        "Hamburger",
                        "비프패티를 기반으로 야채가 들어간 기본버거",
                        5400
                )
        );
        return list;
    }
}
