package com.taehunim.kiosk.levelthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/**
 * kiosk의 필요한 기능을 담은 main class입니다.
 * 프로그램을 실행합니다.
 * Menuitem 객체를 List에 저장합니다.
 * Kiosk 객체를 생성할 때 List Collection과 Scanner 객체를 주입합니다.
 * Kiosk.start method를 호출해 시스템을 시작합니다.
 */
        // 필수 객체 생성
        Scanner scanner = new Scanner(System.in);

        List<MenuItem> menuItems =new ArrayList<>();
        menuItems.add(new MenuItem(
                "ShackBurger",
                6900,
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(
                "SmokeShack",
                8900,
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(
                "Cheeseburger",
                6900,
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(
                "Hamburger",
                5400,
                "비프패티를 기반으로 야채가 들어간 기본버거"));

        Kiosk kiosk = new Kiosk(menuItems, scanner);

        // 시작
        kiosk.start();
    }
}
