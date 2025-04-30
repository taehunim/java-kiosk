package com.taehunim.kiosk.advancedlevelzero.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuDb {

    public final List<MenuItem> menuDb = new ArrayList<>();

    public MenuDb() {
        menuDb.add(
                new MenuItem(
                        "Burger",
                        "ShackBurger",
                        "토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                        6900
                )
        );
        menuDb.add(
                new MenuItem(
                        "Burger",
                        "SmokeShack",
                        "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                        8900
                )
        );
        menuDb.add(
                new MenuItem(
                        "Burger",
                        "Cheeseburger",
                        "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                        6900
                )
        );
        menuDb.add(
                new MenuItem(
                        "Burger",
                        "Hamburger",
                        "비프패티를 기반으로 야채가 들어간 기본버거",
                        5400
                )
        );
        menuDb.add(
                new MenuItem(
                        "Drink",
                        "Coke",
                        "톡 쏘는 시원한 코카콜라",
                        2000
                )
        );
        menuDb.add(
                new MenuItem(
                        "Drink",
                        "Sprite",
                        "청량감 있는 레몬-라임 탄산음료",
                        2000
                )
        );
        menuDb.add(
                new MenuItem(
                        "Drink",
                        "Iced Tea",
                        "달콤한 복숭아 맛의 아이스티",
                        2300
                )
        );
        menuDb.add(
                new MenuItem(
                        "Drink",
                        "Fanta",
                        "상큼한 오렌지향 탄산음료",
                        2000
                )
        );
        menuDb.add(
                new MenuItem(
                        "Desert",
                        "Vanilla Custard",
                        "진한 바닐라 맛의 커스터드 아이스크림",
                        3500
                )
        );
        menuDb.add(
                new MenuItem(
                        "Desert",
                        "Cheesecake",
                        "부드럽고 진한 맛의 뉴욕 치즈케이크",
                        4500
                )
        );
        menuDb.add(
                new MenuItem(
                        "Desert",
                        "Choco Brownie",
                        "진한 초콜릿의 브라우니 케이크",
                        4000
                )
        );
        menuDb.add(
                new MenuItem(
                        "Desert",
                        "Strawberry Sundae",
                        "상큼한 딸기 소스가 올라간 아이스크림 선데",
                        3800
                )
        );
    }

    public void addMenuDb(String productCategory, String productName, String productInfo, int productPrice) {
        menuDb.add(new MenuItem(productCategory, productName, productInfo, productPrice));
    }
}
