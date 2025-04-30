package com.taehunim.kiosk.levelfour;

import java.util.*;

/**
 * kiosk의 필요한 기능을 담은 main class입니다.
 * 프로그램을 실행합니다.
 * Menuitem 객체를 각각의 List에 저장합니다.
 * Kiosk 객체를 생성할 때 Scanner 객체를 주입합니다.
 * Menu 객체를 생성할 때 List를 주입합니다.
 * 각 category별로 Menu 객체를 만듭니다.
 * Kiosk.start method를 호출해 시스템을 시작합니다.
 */
public class Main {
    public static void main(String[] args) {

        // 필수 객체 생성 및 Collection 생성
        Scanner scanner = new Scanner(System.in);

        // burgerMenuItem List 생성
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

        // drinkMenuItem List 생성
        List<MenuItem> drinkMenuItems = new ArrayList<>();
        drinkMenuItems.add(new MenuItem(
                        "상품이 준비중입니다.",
                        0,
                        "상품이 준비중입니다."
                )
        );

        // desertMenuItem List 생성
        List<MenuItem> desertMenuItems = new ArrayList<>();
        desertMenuItems.add(new MenuItem(
                        "상품이 준비중입니다.",
                        0,
                        "상품이 준비중입니다."
                )
        );

        Menu burgerMenu = new Menu("burger", burgerMenuItems);
        Menu drinkMenu = new Menu("drink", drinkMenuItems);
        Menu desertMenu = new Menu("desert", desertMenuItems);
        new Menu("123")
        Kiosk kiosk = new Kiosk(scanner, burgerMenu, drinkMenu, desertMenu);

        // start method 호출
        kiosk.start();

    }

}
