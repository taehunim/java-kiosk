package com.taehunim.kiosk.advancedlevelone;

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

        // 반복 시작
        kioskSystem:
        while (true) {
            interaction.printStartKioskMessage();

            // 메뉴 출력
            for (int i = 0; i < totalMenu.size(); i++) {
                System.out.println((i + 1) + ". " + totalMenu.get(i).getCategory());
            }
            interaction.printExitCodeInfo();

            // 메뉴 선택 출력
            interaction.printHowSelectMenu();
            interaction.printInputLocation();
            String input = interaction.userTextInput();

            // 문자열 to 정수변환 유효성 검사
            inputNumber = interaction.exceptionHandlingForStringtoint(input);
            if (inputNumber == -1) {
                interaction.printWarningWrongValue();
            } else {

                // 입력된 값에 따라서 카테고리 안 메뉴를 출력 후 세부 메뉴 선택
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


