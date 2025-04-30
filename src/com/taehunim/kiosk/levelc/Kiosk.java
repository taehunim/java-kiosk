package com.taehunim.kiosk.levelc;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private final List<MenuItem> menuItems;
    private final Scanner scanner;

    // 생성자
    public Kiosk(Scanner scanner, List<MenuItem> menuItems) {
        this.scanner = scanner;
        this.menuItems = menuItems;
    }

    // 메소드
    public void start () {
        kioskSystem:
        while (true) {

            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");

            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.println((i + 1) + ". " + menuItem.getProductName() + "\t| W " +
                        (menuItem.getProductPrice() * 0.001) + " |\t + " + menuItem.getProductInfo());
            }
            System.out.println("0. 종료\t\t\t|  종료  |");

            // 스캐너 객체 활용
            System.out.print("입력 창: ");
            String userInput = scanner.nextLine();

            // 조건문 사용
            // 메뉴가 제시된 후 숫자의 입력에 따라 다른 로직을 실행
            // 반복문을 사용하여 특정 번호가 입력되면 프로그램 종료
            switch (userInput) {
                case "0" -> {
                    break kioskSystem;
                }
                case "1" -> System.out.println("ShackBurger      주문완료");
                case "2" -> System.out.println("SmokeShack       주문완료");
                case "3" -> System.out.println("Cheeseburger     주문완료");
                case "4" -> System.out.println("Hamburger        주문완료");
                default -> System.out.println("올바른 값을 입력해주세요.");
            }
        }


    }
}
