package com.taehunim.kiosk.advancedlevelzero.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuDatabase {

    // 속성
    private final List<MenuItem> menuItems = new ArrayList<>();

    // 생성자
    public MenuDatabase() {

        // 햄버거 메뉴
        menuItems.add(new MenuItem(
                        "ShackBurger",
                        "토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                        "Burger",
                        6900
                )
        );
        menuItems.add(new MenuItem(
                        "SmokeShack",
                        "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                        "Burger",
                        8900
                )
        );
        menuItems.add(new MenuItem(
                        "Cheeseburger",
                        "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                        "Burger",
                        6900
                )
        );
        menuItems.add(new MenuItem(
                        "Hamburger",
                        "비프패티를 기반으로 야채가 들어간 기본버거",
                        "Burger",
                        5400
                )
        );

        // 음료 메뉴
        menuItems.add(new MenuItem(
                        "Coke",
                        "톡 쏘는 시원한 코카콜라",
                        "Drink",
                        2000
                )
        );
        menuItems.add(new MenuItem(
                        "Sprite",
                        "청량감 있는 레몬-라임 탄산음료",
                        "Drink",
                        2000
                )
        );
        menuItems.add(new MenuItem(
                        "Iced Tea",
                        "달콤한 복숭아 맛의 아이스티",
                        "Drink",
                        2300
                )
        );
        menuItems.add(new MenuItem(
                        "Fanta",
                        "상큼한 오렌지향 탄산음료",
                        "Drink",
                        2000
                )
        );

        // 디저트
        menuItems.add(new MenuItem(
                        "Vanilla Custard",
                        "진한 바닐라 맛의 커스터드 아이스크림",
                        "Dessert",
                        3500
                )
        );
        menuItems.add(new MenuItem(
                        "Cheesecake",
                        "부드럽고 진한 맛의 뉴욕 치즈케이크",
                        "Dessert",
                        4500
                )
        );

        menuItems.add(new MenuItem(
                        "Choco Brownie",
                        "진한 초콜릿의 브라우니 케이크",
                        "Dessert",
                        4000
                )
        );

        menuItems.add(new MenuItem(
                        "Strawberry Sundae",
                        "상큼한 딸기 소스가 올라간 아이스크림 선데",
                        "Dessert",
                        3800
                )
        );

    }

    // 기능

    //
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
