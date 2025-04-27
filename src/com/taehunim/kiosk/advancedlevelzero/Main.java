package com.taehunim.kiosk.advancedlevelzero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 필수 객체 생성
        Scanner scanner = new Scanner(System.in);

        MenuSelector burgerMenuSelector = new BurgerMenuSelector();
        MenuSelector drinkMenuSelector = new DrinkMenuSelector();
        MenuSelector desertMenuSelector = new DesertMenuSelector();

        Menu burgerMenu = new Menu("버거", burgerMenuSelector);
        Menu drinkMenu = new Menu("음료", drinkMenuSelector);
        Menu desertMenu = new Menu("디저트", desertMenuSelector);

        List<Menu> totalMenu = new ArrayList<>();
        totalMenu.add(burgerMenu);
        totalMenu.add(drinkMenu);
        totalMenu.add(desertMenu);
        Interaction interaction = new Interaction(scanner, totalMenu);
        Kiosk kiosk = new Kiosk(interaction, totalMenu);


        // 필수 method 호출
        kiosk.startKiosk();
    }
}
