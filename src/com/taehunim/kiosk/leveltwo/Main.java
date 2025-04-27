package com.taehunim.kiosk.leveltwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItem = new ArrayList<>();

        // collection을 활용해 Menuitem 저장
        menuItem.add(new MenuItem("ShackBuger", 6900,
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("SmokeShack", 8900,
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("Cheeseburger", 6900,
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" ));
        menuItem.add(new MenuItem("Hamburger", 5400,
                "비프패티를 기반으로 야채가 들어간 기본버거"));
    }
}
