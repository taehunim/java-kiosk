package levelc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // 객체 생성을 통해 이름 가격 설명 세팅
        menuItems = List.of(
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

        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // Kiosk 객체 생성
        // List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
        Kiosk kiosk = new Kiosk(scanner, menuItems);

        kiosk.start();

    }
}
