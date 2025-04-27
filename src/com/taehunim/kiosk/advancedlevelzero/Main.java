package com.taehunim.kiosk.advancedlevelzero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 필수 객체 생성
        Scanner scanner = new Scanner(System.in);
        Interaction interaction = new Interaction(scanner);
        MenuSelector burgerMenuSelector = new BurgerMenuSelector();
        MenuSelector drinkMenuSelector = new DrinkMenuSelector();
        MenuSelector desertMenuSelector = new DesertMenuSelector();



        Kiosk kiosk = new Kiosk(interaction);


        // 필수 method 호출
        kiosk.startKiosk();
    }
}
