package com.taehunim.kiosk.levelthree;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private final List<MenuItem> menuItems;
    private final Scanner scanner;
    private String Userinput;
    private int selectNumber;

    // 생성자
    public Kiosk(List<MenuItem> menuItems, Scanner scanner) {
        this.menuItems = menuItems;
        this.scanner = scanner;
    };

    // 기능
    // 시스템 시작
    public void start() {

        // 반복문 시작 label: kioskSystem
        kioskSystem:
        while (true) {

            // 메뉴 출력
            for (int i = 0; i < menuItems.size(); i++ ) {
                MenuItem menu = menuItems.get(i);
                System.out.println((i + 1) + ". " + menu.getBurgerName() + "   | W" +
                        (menu.getBurgerPrice() * 0.001) + " | " + menu.getBurgerInfo());
            }

            // 사용자 메뉴 선택
            System.out.print("입력창 : ");
            Userinput = scanner.nextLine();

            // 입력된 문자열 정수로 변환
            try {
                selectNumber = Integer.parseInt(Userinput);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                continue;
            }

            if (selectNumber == 0) {
                break kioskSystem;
            } else if (selectNumber > menuItems.size() || selectNumber < 0) {
                System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
            } else {
                System.out.println(menuItems.get((selectNumber - 1)).getBurgerName() + "주문 완료");
            }
        }
    }
}
