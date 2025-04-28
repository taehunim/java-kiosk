package com.taehunim.kiosk.advancedlevelzero.menu.menuData;

import com.taehunim.kiosk.advancedlevelzero.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class drinkMenuData implements MenuData {
    @Override
    public List<MenuItem> menuDataOfProduct() {
        List list = new ArrayList<>();
        list.add(new MenuItem(
                        "Coca-Cola",
                        "시원한 탄산이 터지는 클래식 코카콜라",
                        2000
                )
        );
        list.add(new MenuItem(
                        "Sprite",
                        "상큼하고 청량한 레몬-라임 탄산음료",
                        2000
                )
        );
        list.add(new MenuItem(
                        "Iced Americano",
                        "깊고 깔끔한 맛의 아이스 아메리카노",
                        2500
                )
        );
        list.add(new MenuItem(
                        "Chocolate Shake",
                        "진한 초콜릿 풍미가 가득한 스무디 쉐이크",
                        3500
                )
        );
        return list;
    }
}