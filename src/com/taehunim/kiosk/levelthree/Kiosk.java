package com.taehunim.kiosk.levelthree;

import java.util.List;
import java.util.Scanner;

/**
 * kiosk의 흐름과 실행을 담당하는 Kiosk class입니다.
 * 프로그램의 핵심 로직을 담당합니다.
 * start method를 통해 핵심 로직을 구현합니다.
 * 주입받은 List를 저장합니다.
 */
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
            System.out.println("[Real Buger 메뉴]");
            for (int i = 0; i < menuItems.size(); i++ ) {
                MenuItem menu = menuItems.get(i);
                System.out.println((i + 1) + ". " + menu.getBurgerName() + "   | W" +
                        (menu.getBurgerPrice() * 0.001) + " | " + menu.getBurgerInfo());
            }

            // 안내문구 출력
            System.out.println("주문하시려면 원하시는 메뉴의 번호를 입력하시면 주문이 완료됩니다.");
            System.out.println("0을 입력하시면 프로그램을 종료합니다.");

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
