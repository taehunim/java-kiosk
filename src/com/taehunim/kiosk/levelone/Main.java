package com.taehunim.kiosk.levelone;

import java.util.Scanner;

/**
 * kiosk의 필수적인 기능을 담은 main class입니다.
 * 프로그램을 실행시킵니다.
 * 반복문과 switch문을 통해 시스템의 흐름을 제어합니다.
 * 사용자가 입력한 값에 따라 메뉴를 선택하거나 시스템을 종료 시킬 수 있습니다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int selectNumber;

        // 반복 시작지점
        kioskSystem:
        while (true) {

            // 메뉴 출력
            System.out.println("[Real Buger 메뉴]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료           | 종료");
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
            switch (selectNumber) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    break kioskSystem;
                }
                case 1 -> System.out.println("ShackBurger 주문 완료");
                case 2 -> System.out.println("SmokeShack 주문 완료");
                case 3 -> System.out.println("Cheeseburger 주문 완료");
                case 4 -> System.out.println("Hamburger 주문 완료");
                default -> System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
            }
        }
    }
}
