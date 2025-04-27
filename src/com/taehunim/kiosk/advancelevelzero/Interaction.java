package com.taehunim.kiosk.advancelevelzero;

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


}
}
