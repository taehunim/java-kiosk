package com.taehunim.kiosk.levele;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 객체 생성을 통해 이름 가격 설명 세팅
        List<MenuItem> burgers = List.of(
                new MenuItem(
                        "ShackBurger",
                        6900,
                        "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
                ), new MenuItem(
                        "SmokeShack",
                        8900,
                        "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
                ), new MenuItem(
                        "Cheeseburger",
                        6900,
                        "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
                ), new MenuItem(
                        "Hamburger",
                        5400,
                        "비프패티를 기반으로 야채가 들어간 기본버거"
                )
        );

        List<MenuItem> drinks = List.of(
                new MenuItem(
                        "Coke",
                        2000,
                        "톡 쏘는 시원한 코카콜라"
                ), new MenuItem(
                        "Sprite",
                        2000,
                        "청량감 있는 레몬-라임 탄산음료"
                ), new MenuItem(
                        "Iced Tea",
                        2300,
                        "달콤한 복숭아 맛의 아이스티"
                ), new MenuItem(
                        "Fanta",
                        2000,
                        "상큼한 오렌지향 탄산음료"
                )
        );

        List<MenuItem> desserts = List.of(
                new MenuItem(
                        "Vanilla Custard",
                        3500,
                        "진한 바닐라 맛의 커스터드 아이스크림"
                ), new MenuItem(
                        "Cheesecake",
                        4500,
                        "부드럽고 진한 맛의 뉴욕 치즈케이크"
                ), new MenuItem(
                        "Choco Brownie",
                        4000,
                        "진한 초콜릿의 브라우니 케이크"
                ), new MenuItem(
                        "Strawberry Sundae",
                        3800,
                        "상큼한 딸기 소스가 올라간 아이스크림 선데"
                )
        );

        List<Menu> menus = List.of(
                new Menu("Burger", burgers),
                new Menu("Drink", drinks),
                new Menu("Dessert", desserts)
        );

        Cart cart = new Cart();


        Scanner scanner = new Scanner(System.in);
        Kiosk kiosk = new Kiosk(scanner, cart, menus);

        kiosk.start();

    }
}
