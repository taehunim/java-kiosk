package com.taehunim.kiosk.advancedlevelzero.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuDetailInfo {

    // 속성
    List<MenuItem> burgerMenuItems = new ArrayList<>();
    List<MenuItem> drinkMenuItems = new ArrayList<>();
    List<MenuItem> desertMenuItems = new ArrayList<>();

    // 생성자
    MenuDetailInfo() {

        // 버거 정보 주입 객체
        burgerMenuItems.add(new MenuItem(
                        "ShackBurger",
                        6900,
                        "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
                )
        );
        burgerMenuItems.add(new MenuItem(
                        "SmokeShack",
                        8900,
                        "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
                )
        );
        burgerMenuItems.add(new MenuItem(
                        "Cheeseburger",
                        6900,
                        "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
                )
        );
        burgerMenuItems.add(new MenuItem(
                        "Hamburger",
                        5400,
                        "비프패티를 기반으로 야채가 들어간 기본버거"
                )
        );

        // 음료 정보 주입 객체
        drinkMenuItems.add(new MenuItem(
                        "Coca-Cola",
                        2000,
                        "시원한 탄산이 터지는 클래식 코카콜라"
                )
        );
        drinkMenuItems.add(new MenuItem(
                        "Sprite",
                        2000,
                        "상큼하고 청량한 레몬-라임 탄산음료"
                )
        );
        drinkMenuItems.add(new MenuItem(
                        "Iced Americano",
                        2500,
                        "깊고 깔끔한 맛의 아이스 아메리카노"
                )
        );
        drinkMenuItems.add(new MenuItem(
                        "Chocolate Shake",
                        3500,
                        "진한 초콜릿 풍미가 가득한 스무디 쉐이크"
                )
        );

        // 디저트 정보 주입 객체
        desertMenuItems.add(new MenuItem(
                        "Vanilla Ice Cream",
                        2500,
                        "부드럽고 달콤한 바닐라 아이스크림"
                )
        );
        desertMenuItems.add(new MenuItem(
                        "Chocolate Chip Cookie",
                        2000,
                        "바삭하고 진한 초콜릿칩이 가득한 쿠키"
                )
        );
        desertMenuItems.add(new MenuItem(
                        "Cheesecake Slice",
                        3500,
                        "진한 크림치즈 맛의 부드러운 치즈케이크"
                )
        );
        desertMenuItems.add(new MenuItem(
                        "Apple Pie",
                        2500,
                        "따끈하고 달콤한 애플파이"
                )
        );

        //기능

    }
}
