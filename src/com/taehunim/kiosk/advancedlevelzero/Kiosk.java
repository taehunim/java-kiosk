package com.taehunim.kiosk.advancedlevelzero;

import java.util.List;

public class Kiosk {

    // 속성
    private final Interaction interaction;
    private final List<Menu> totalMenu;
    private int inputNumber;

    // 생성자
    Kiosk(Interaction interaction, List totalMenu) {
        this.interaction = interaction;
        this.totalMenu = totalMenu;
    }

    // 기능
    public void startKiosk() {
        kioskSystem:
        while (true) {
            interaction.printStartKioskMessage();
            for (int i = 0; i < totalMenu.size(); i++) {
                System.out.println((i + 1) + ". " + totalMenu.get(i).getCategory());
            }
            interaction.printExitCodeInfo();
            interaction.printHowSelectMenu();
            interaction.printInputLocation();
            String input = interaction.userTextInput();
            if (inputNumber == -1) {
                interaction.pirntWarningWrongValue();
                continue;
            }
            switch (inputNumber) {
                case 0 -> {
                    interaction.pirntExitIntro();
                    break kioskSystem;
                }
                case 1 -> {
                    interaction.printStartKioskMessage();
                    for (int i = 0; i < totalMenu.get(0).getMenuItems().size(); i++) {
                        System.out.println((i + 1) + ".      " +
                                totalMenu.get(0).getMenuItems().get(i).getProductName() +
                                "     " +
                                totalMenu.get(0).getMenuItems().get(i).getProductPrice() +
                                "원      " +
                                totalMenu.get(0).getMenuItems().get(i).getProductInfo()
                        );
                    }
                    interaction.printReturnMainInfo();
                    interaction.printInputLocation();
                    input = interaction.userTextInput();
                    inputNumber = interaction.exceptionHandlingForStringtoint(input);
                    if (inputNumber == -1) {
                        interaction.pirntWarningWrongValue();
                        continue;
                    }
                    if (inputNumber == 0) {
                        interaction.pirntWarningWrongValue();
                        continue;
                    } else if (inputNumber >= 1 && inputNumber <= totalMenu.get(0).getMenuItems().size()) {
                        System.out.println(
                                totalMenu.get(0).getMenuItems().get(inputNumber - 1).getProductName() +
                                        " 주문완료"
                        );
                    }
                }
                case 2 -> {
                    interaction.printStartKioskMessage();
                    for (int i = 0; i < totalMenu.get(1).getMenuItems().size(); i++) {
                        System.out.println((i + 1) + ".      " +
                                totalMenu.get(1).getMenuItems().get(i).getProductName() +
                                "     " +
                                totalMenu.get(1).getMenuItems().get(i).getProductPrice() +
                                "원      " +
                                totalMenu.get(1).getMenuItems().get(i).getProductInfo()
                        );
                    }
                    interaction.printReturnMainInfo();
                    interaction.printInputLocation();
                    input = interaction.userTextInput();
                    if (inputNumber == -1) {
                        interaction.pirntWarningWrongValue();
                        continue;
                    }
                    if (inputNumber == 0) {
                        interaction.pirntWarningWrongValue();
                        continue;
                    } else if (inputNumber >= 1 && inputNumber <= totalMenu.get(1).getMenuItems().size()) {
                        System.out.println(
                                totalMenu.get(1).getMenuItems().get(inputNumber - 1).getProductName() +
                                        " 주문완료"
                        );
                    }
                }
                case 3 -> {
                    interaction.printStartKioskMessage();
                    for (int i = 0; i < totalMenu.get(2).getMenuItems().size(); i++) {
                        System.out.println((i + 1) + ".      " +
                                totalMenu.get(2).getMenuItems().get(i).getProductName() +
                                "     " +
                                totalMenu.get(2).getMenuItems().get(i).getProductPrice() +
                                "원      " +
                                totalMenu.get(2).getMenuItems().get(i).getProductInfo()
                        );
                    }
                    interaction.printReturnMainInfo();
                    interaction.printInputLocation();
                    input = interaction.userTextInput();
                    if (inputNumber == -1) {
                        interaction.pirntWarningWrongValue();
                        continue;
                    }
                    if (inputNumber == 0) {
                        interaction.pirntWarningWrongValue();
                        continue;
                    } else if (inputNumber >= 1 && inputNumber <= totalMenu.get(2).getMenuItems().size()) {
                        System.out.println(
                                totalMenu.get(2).getMenuItems().get(inputNumber - 1).getProductName() +
                                        " 주문완료"
                        );
                    }
                }
                default -> {
                    interaction.pirntWarningWrongValue();
                    continue;
                }
            }
        }
    }

}


