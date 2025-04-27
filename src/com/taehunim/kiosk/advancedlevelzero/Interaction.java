package com.taehunim.kiosk.advancedlevelzero;

import java.util.List;
import java.util.Scanner;

public class Interaction {

    // 속성
    private final Scanner scanner;
    private final List<Menu> totalMenu;

    // 생성자
    public Interaction(Scanner scanner, List totalMenu) {
        this.scanner = scanner;
        this.totalMenu = totalMenu;
    }

    // 기능


    public String userTextInput() {
        return scanner.nextLine();
    }

    public void printStartKioskMessage() {
        System.out.println("메뉴를 선택해주세요.");
    }

    public void printExitCodeInfo() {
        System.out.println("0. 0을 입력하면 프로그램을 종료합나다.");
    }

    public void printReturnMainInfo() {
        System.out.println("0. 0을 입력하면 카테고리 화면으로 되돌아갑니다.");
    }

    public void printExitIntro() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void printHowSelectMenu() {
        System.out.println("메뉴에 해당되는 숫자를 입력 후 Enter키를 누르세요.");
    }

    public void printWarningWrongValue() {
        System.out.println("잘못된 값을 입력하셨습니다.");
    }

    public void printInputLocation() {
        System.out.print("입력 값: ");
    }

    public int exceptionHandlingForStringtoint(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void printUserSelectMenu(int value) {
        printStartKioskMessage();
        Menu menuList = totalMenu.get(value);
        for (int i = 0; i < menuList.getMenuItems().size(); i++) {
            MenuItem Item = menuList.getMenuItems().get(i);
            System.out.println((i + 1) + ".      " +
                    Item.getProductName() +
                    "     " +
                    Item.getProductPrice() +
                    "원      " +
                    Item.getProductInfo()
            );
        }
    }

    public void selectInputMenu(int value) {
        printUserSelectMenu(value);
        printReturnMainInfo();
        printInputLocation();
        String input = userTextInput();
        int inputNumber = exceptionHandlingForStringtoint(input);
        if (inputNumber == -1 || inputNumber == 0) {
            printWarningWrongValue();
            return;
        }
        List<MenuItem> itemList = totalMenu.get(value).getMenuItems();
        if (inputNumber >= 1 && inputNumber <= itemList.size()) {
            System.out.println(
                    itemList.get(inputNumber - 1).getProductName() +
                            " 주문완료"
            );
        } else {
            printWarningWrongValue();
        }
    }
}


