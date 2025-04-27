package com.taehunim.kiosk.leveltwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * kiosk의 필요한 기능을 담은 main class입니다.
 * 프로그램을 실행합니다.
 * Menuitem 객체를 List에 저장합니다.
 * 저장할 때 직접 속성을 주입합니다.
 * 반복문과 switch문을 통해 시스템의 흐름을 제어합니다.
 * 사용자가 입력한 값에 따라 메뉴를 선택하거나 시스템을 종료시킬 수 있습니다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();

        String userInput;
        int selectNumber;

        // collection을 활용해 Menuitem 저장
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

        // 반복문 시작
        kioskSystem:
        while (true) {

            // 메뉴 출력
            System.out.println("[Real Burger 메뉴]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menu = menuItems.get(i);
                System.out.println((i + 1) + ". " + menu.getBurgerName() + "   | W" +
                        (menu.getBurgerPrice() * 0.001) + " | " + menu.getBurgerInfo());
            }
            System.out.println("0. 종료           | 종료");

            // 안내 문구 출력
            System.out.println("주문하시려면 원하시는 메뉴의 번호를 입력하시면 주문이 완료됩니다.");
            System.out.println("0을 입력하시면 프로그램을 종료합니다.");

            // 사용자 메뉴 선택
            System.out.print("입력창 : ");
            userInput = scanner.nextLine();

            // 입력된 문자열 정수로 변환
            try {
                selectNumber = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                continue;
            }

            // 변환 받은 정수 판별
            if (selectNumber > menuItems.size() || selectNumber < 0) {
                System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                continue;
            } else if (selectNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                break kioskSystem;
            } else {
                System.out.println(menuItems.get(selectNumber - 1).getBurgerName() + " 주문 완료");
            }
        }
    }
}
