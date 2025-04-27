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
            inputNumber = interaction.exceptionHandlingForStringtoint(input);
            if (inputNumber == -1) {
                interaction.printWarningWrongValue();
                continue;
            } else {
                switch (inputNumber) {
                    case 0 -> {
                        interaction.printExitIntro();
                        break kioskSystem;
                    }
                    case 1 -> {
                        interaction.selectInputMenu(0);
                    }
                    case 2 -> {
                        interaction.selectInputMenu(1);
                    }
                    case 3 -> {
                        interaction.selectInputMenu(2);
                    }
                    default -> {
                        interaction.printWarningWrongValue();
                    }
                }
            }
        }
    }
}


