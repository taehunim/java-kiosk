package com.taehunim.kiosk.levelf;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner scanner;
    private final List<Menu> menus;

    public Kiosk(Scanner scanner, List<Menu> menus) {
        this.scanner = scanner;
        this.menus = menus;
    }

}
