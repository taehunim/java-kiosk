package com.taehunim.kiosk.levelfour;

import java.util.List;
import java.util.Scanner;

/**
 * kiosk의 흐름과 실행을 담당하는 Kiosk class입니다.
 * 프로그램의 핵심 로직을 담당합니다.
 * start method를 통해 핵심 로직을 구현합니다.
 * Scanner 객체와 Main 객체를 주입받아 활용합니다.
 */
public class Kiosk {

    // 속성
    private final Scanner scanner;
    private final Menu burgermenu;
    private final Menu drinkmenu;
    private final Menu desertmenu;
    private String userInput;
    private int selectNumber;
    private List<MenuItem> selectMenu;

    // 생성자
    public Kiosk(Scanner scanner, Menu menuA, Menu menuB, Menu menuC) {
        this.scanner = scanner;
        this.burgermenu = menuA;
        this.drinkmenu = menuB;
        this.desertmenu = menuC;
    }

    // 기능
    public void start() {

        // 반복문 시작
        kioskSystem:
        while (true) {
            System.out.println("주문하시려면 원하시는 카테고리의 번호를 입력하시면 해당 메뉴가 출력됩니다..");
            System.out.println("1. " + burgermenu.getCategory());
            System.out.println("2. " + drinkmenu.getCategory());
            System.out.println("3. " + desertmenu.getCategory());
            System.out.println("0. 0을 입력시 시스템을 종료합니다.");

            // 카테고리 선택창
            System.out.print("입력창 : ");
            userInput = scanner.nextLine();

            // 입력 받은 문자열 정수로 변환
            try {
                selectNumber = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                continue;
            }

            // 정수 판별
            switch (selectNumber) {
                case 0 -> {
                    break kioskSystem;
                }
                case 1 -> {

                    System.out.println("[Real Burger 메뉴]");
                    burgermenu.getMenuItems();
                    System.out.println("0   | 뒤로 가기");

                    // 버거 메뉴 선택 입력창
                    System.out.print("입력창 : ");
                    userInput = scanner.nextLine();

                    // 정수 판별
                    try {
                        selectNumber = Integer.parseInt(userInput);
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                        continue;
                    }

                    // 입력 받은 정수 판별
                    selectMenu = burgermenu.getMenuItem();
                    if (selectNumber == 0) {
                        continue;
                    } else if (selectNumber > selectMenu.size() || selectNumber < 0) {
                        System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                    } else {
                        selectMenu = burgermenu.getMenuItem();
                        System.out.println(
                                selectMenu.get(selectNumber - 1).getGoodsName() +
                                        "   |   " +
                                selectMenu.get(selectNumber - 1).getGoodsPrice() +
                                        "W   |   " +
                                selectMenu.get(selectNumber - 1).getGoodsInfo() +
                                        " --- 주문 완료"
                        );
                    }
                }
                case 2 -> drinkmenu.getMenuItems();

                case 3 -> drinkmenu.getMenuItems();

                default -> System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");

            }
        }
    }
}
