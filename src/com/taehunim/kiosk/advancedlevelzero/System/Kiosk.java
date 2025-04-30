package com.taehunim.kiosk.advancedlevelzero.System;

import java.util.Scanner;

public class Kiosk {

    // 속성
    private final Scanner scanner;


    // 생성자
    public Kiosk(Scanner scanner) {
        this.scanner = scanner;
    }

    // 기능
    // 프로그램 흐름제어
    public void startKiosk() {
        System.out.println("[ MAIN MENU ]");

        // 카테고리 출력


        // 사용자 입력 후 정수 변환
        String userInput = userInput();
        int userSelectNumber = stringToInt(userInput);

        // 조건문 분기 : 카테고리 선택


    }

    public String userInput() {
        System.out.print("입력창: ");
        return scanner.nextLine();
    }

    public int stringToInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return -1;
        }
    }


}

