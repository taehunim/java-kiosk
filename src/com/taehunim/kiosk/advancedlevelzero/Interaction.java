package com.taehunim.kiosk.advancedlevelzero;

import java.util.Scanner;

public class Interaction {

    // 속성
    private final Scanner scanner;

    // 생성자
    public Interaction(Scanner scanner) {
        this.scanner = scanner;
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

    public void pirntExitIntro() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void printHowSelectMenu() {
        System.out.println("메뉴에 해당되는 숫자를 입력 후 Enter키를 누르세요.");
    }

    public void pirntWarningWrongValue() {
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
}

