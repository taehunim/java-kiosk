package com.taehunim.kiosk.advancedlevelzero;

public class Kiosk {

    // 속성
    private final Interaction interaction;

    // 생성자
    Kiosk(Interaction interaction) {
        this.interaction = interaction;
    }

    // 기능
    public void startKiosk() {
        while (true) {
            interaction.printStartKioskMessage();

        }
    }


}
