package com.taehunim.kiosk.advancedlevelzero.app;

import com.taehunim.kiosk.advancedlevelzero.Menu.Menu;
import com.taehunim.kiosk.advancedlevelzero.System.Kiosk;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // 필수 객체 생성
        Scanner scanner = new Scanner(System.in);
        Kiosk kiosk = new Kiosk(scanner);

        // 필수 메소드 호출
        kiosk.startKiosk();
    }
}
