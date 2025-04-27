package com.taehunim.kiosk.levelfour;

import java.util.List;
import java.util.Scanner;

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
        kioskSystem:
        while (true) {
            System.out.println("주문하시려면 원하시는 카테고리의 번호를 입력하시면 해당 메뉴가 출력됩니다..");
            System.out.println("1. " + burgermenu.getCategory());
            System.out.println("2. " + drinkmenu.getCategory());
            System.out.println("3. " + desertmenu.getCategory());
            System.out.println("0. 0을 입력시 시스템을 종료합니다.");

            System.out.print("입력창 : ");
            userInput = scanner.nextLine();

            try {
                selectNumber = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                continue;
            }

            switch (selectNumber) {
                case 0 -> {
                    break kioskSystem;
                }
                case 1 -> {

                    System.out.println("[Real Burger 메뉴]");
                    burgermenu.getMenuItems();
                    System.out.println("0   | 뒤로 가기");

                    System.out.print("입력창 : ");
                    userInput = scanner.nextLine();

                    try {
                        selectNumber = Integer.parseInt(userInput);
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 주문 번호 입니다.\n 다시 입력해주세요");
                        continue;
                    }
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
