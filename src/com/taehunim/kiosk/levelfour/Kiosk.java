package com.taehunim.kiosk.levelfour;

import java.util.Scanner;

public class Kiosk {

    // 속성
    private final Scanner scanner;
    private final Menu menuBurger;
    private final Menu menuDrink;
    private final Menu menuDesert;

    // 생성자
    Kiosk(Scanner scanner, Menu menuA,Menu menuB, Menu menuC) {
        this.scanner = scanner;
        this.menuBurger = menuA;
        this.menuDrink = menuA;
        this.menuDesert = menuC;
    }
    // 기능
}
