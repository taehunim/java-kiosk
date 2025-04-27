package com.taehunim.kiosk.levelfour;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 필수 객체 생성 및 Collection 생성
        Scanner scanner = new Scanner(System.in);

        List<MenuItem> burgerMenuItems = new ArrayList<>();
        burgerMenuItems.add(new MenuItem(
                        "ShackBurger",
                        6900,
                        "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
                )
        );
        burgerMenuItems.add(new MenuItem(
                        "SmokeShack",
                        8900,
                        "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
                )
        );
        burgerMenuItems.add(new MenuItem(
                        "Cheeseburger",
                        6900,
                        "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
                )
        );
        burgerMenuItems.add(new MenuItem(
                        "Hamburger",
                        5400,
                        "비프패티를 기반으로 야채가 들어간 기본버거"
                )
        );

        List<MenuItem> drinkMenuItems = new ArrayList<>();
        drinkMenuItems.add(new MenuItem(
                        "상품이 준비중입니다.",
                        0,
                        "상품이 준비중입니다."
                )
        );
        List<MenuItem> desertMenuItems = new ArrayList<>();
        desertMenuItems.add(new MenuItem(
                        "상품이 준비중입니다.",
                        0,
                        "상품이 준비중입니다."
                )
        );

        Menu burgerMenu = new Menu("burger", burgerMenuItems);
        Menu drinkMenu = new Menu("drink", burgerMenuItems);
        Menu desertMenu = new Menu("desert", burgerMenuItems);

        Kiosk kiosk = new Kiosk(scanner, burgerMenu, desertMenu, desertMenu);

    }

}
