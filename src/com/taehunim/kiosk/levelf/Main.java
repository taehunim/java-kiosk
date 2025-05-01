package com.taehunim.kiosk.levelf;


import java.util.List;
import java.util.Scanner;
/**
 * 프로그램 구동을 담당하는 클래스
 * 프로그램 실행에 필수적인 객체들을 생성하고 메소드를 호출한다.
 * 필수적인 데이터나 정보를 해당 클래스를 통해 다른 객체들에게 주입해준다.
 * */
public class Main {
    public static void main(String[] args) {

        // 객체 생성을 통해 이름 가격 설명 세팅
        // 햄버거 메뉴
        List<MenuItem> burgers = List.of(
                new MenuItem(
                        "ShackBurger",
                        6900,
                        "토마토, 양상추, 쉑소스가 토핑된 치즈버거"
                ), new MenuItem(
                        "SmokeShack",
                        8900,
                        "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
                ), new MenuItem(
                        "Cheeseburger",
                        6900,
                        "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
                ), new MenuItem(
                        "Hamburger",
                        5400,
                        "비프패티를 기반으로 야채가 들어간 기본버거"
                )
        );


        // 드링크 메뉴
        List<MenuItem> drinks = List.of(
                new MenuItem(
                        "Coke",
                        2000,
                        "톡 쏘는 시원한 코카콜라"
                ), new MenuItem(
                        "Sprite",
                        2000,
                        "청량감 있는 레몬-라임 탄산음료"
                ), new MenuItem(
                        "Iced Tea",
                        2300,
                        "달콤한 복숭아 맛의 아이스티"
                ), new MenuItem(
                        "Fanta",
                        2000,
                        "상큼한 오렌지향 탄산음료"
                )
        );


        // 디저트 메뉴
        List<MenuItem> desserts = List.of(
                new MenuItem(
                        "Vanilla Custard",
                        3500,
                        "진한 바닐라 맛의 커스터드 아이스크림"
                ), new MenuItem(
                        "Cheesecake",
                        4500,
                        "부드럽고 진한 맛의 뉴욕 치즈케이크"
                ), new MenuItem(
                        "Choco Brownie",
                        4000,
                        "진한 초콜릿의 브라우니 케이크"
                ), new MenuItem(
                        "Strawberry Sundae",
                        3800,
                        "상큼한 딸기 소스가 올라간 아이스크림 선데"
                )
        );

        // 제품 컬렉션을 카테고리와 함께 메뉴 객체 주입 후 컬렉션화
        List<Menu> menus = List.of(
                new Menu("Burger", burgers),
                new Menu("Drink", drinks),
                new Menu("Dessert", desserts)
        );

        // 카트 객체 생성
        Cart cart = new Cart();

        // 스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 키오스크 객체 생성 - 스캐너, 카트. 메뉴 컬렉션 주입
        Kiosk kiosk = new Kiosk(scanner, cart, menus);

        // 시작 메서드 호출
        kiosk.start();

    }
}
