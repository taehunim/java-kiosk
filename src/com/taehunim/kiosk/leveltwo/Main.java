package com.taehunim.kiosk.leveltwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItem = new ArrayList<>();

        String userInput;
        int selectNumber;

        // collection을 활용해 Menuitem 저장
        menuItem.add(new MenuItem(
                "ShackBuger",
                6900,
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem(
                "SmokeShack",
                8900,
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem(
                "Cheeseburger",
                6900,
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItem.add(new MenuItem(
                "Hamburger",
                5400,
                "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 반복문 시작
        kioskSystem:
        while (true) {

            // 메뉴 출력
            for (int i = 0; i < menuItem.size(); i++) {
                MenuItem menu = menuItem.get(i);
                System.out.println((i + 1) + ". " + menu.getBugerName() + "   | W" +
                        (menu.getBugerPrice() * 0.001) + " | " + menu.getBugerInfo());
            }

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
            if (selectNumber > menuItem.size() || selectNumber < 0) {
                System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                continue;
            } else if (selectNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                break kioskSystem;
            } else {
                System.out.println(menuItem.get(selectNumber - 1).getBugerName() + " 주문 완료");
            }
        }
    }
}
