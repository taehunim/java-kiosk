package com.taehunim.kiosk.levelf;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner scanner;
    private final List<Menu> menus;
    private final Cart cart;

    public Kiosk(Scanner scanner, List<Menu> menus, Cart cart) {
        this.scanner = scanner;
        this.menus = menus;
        this.cart = cart;
    }

    public void start() {


    }







    private void printMainMenu() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.println((i + 1) + ". " + menus.get(i).getCategory());
        }
        if (cart.getCartItems().isEmpty())


        }
    }
}
