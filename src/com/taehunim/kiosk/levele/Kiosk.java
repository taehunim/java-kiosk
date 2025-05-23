package com.taehunim.kiosk.levele;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 시스템의 흐름을 담당하는 클래스
 * 역할 상 거의 모든 객체들이 이 클래스로 모인다.
 * 사용자와의 상호작용부터 연산까지 다양한 역할을 수행한다.
 */
public class Kiosk {

    // 속성
    private final List<Menu> menus;
    private final Scanner scanner;
    private final Cart cart;
    private final List<String> categories = new ArrayList<>();

    // 생성자
    public Kiosk(Scanner scanner, Cart cart, List<Menu> menus) {
        this.scanner = scanner;
        this.cart = cart;
        this.menus = menus;
    }

    // 기능
    public void start() {
        while (true) {
            printMainMenu();
            int categorySelect = inputInt();

            // 0입력 탈출
            if (categorySelect == 0) {
                break;
            }

            // 1 2 3 카테고리 선택
            if (categorySelect > 0 && categorySelect <= menus.size()) {
                Menu menu = menus.get(categorySelect - 1);
                printMenu(menu);
                int menuSelect = inputInt();

                // 0 입력 돌아가기
                if (menuSelect == 0) {
                    continue;
                }

                // 유효한 값 중 카테고리 선택 시
                if (menuSelect > 0 && menuSelect <= menu.getMenuItems().size()) {
                    MenuItem item = menu.getMenuItems().get(menuSelect - 1);
                    System.out.println("장바구니에 추가하시렵니까?");
                    System.out.println("1. 예   2. 아니요");
                    int cartSelect = inputInt();
                    if (cartSelect == 1) {
                        cart.addCart(item);
                        System.out.println(item.getProductName() + "이 장바구니에 추가되었습니다.");
                    }
                }

                // 유효한 값 중 장바구니 4번 선택 시
            } else if (categorySelect == 4 && !cart.getCartItem().isEmpty()) {
                showCart();
                System.out.println("1. 주문   2. 메뉴판");
                int orderSelect = inputInt();
                if (orderSelect == 1) {
                    System.out.println("주문이 완료되었습니다.");
                    System.out.print("금액은 ");
                    int totalprice = cart.totalPrice();
                    System.out.printf("W %.1f", (double) totalprice);
                    System.out.println(" 입니다\n");
                    cart.clearCart();
                }
            } else if (categorySelect == 5 && !cart.getCartItem().isEmpty()) {
                System.out.println("주문을 취소합니다.");
                cart.clearCart();
                continue;
            } else {
                System.out.println("올바른 값을 입력해 주세요.");
            }
        }
    }

    // 기능
    // 문자열 입력 창
    public int inputInt() {
        try {
            System.out.print("입력 창: ");
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // 카테고리 출력 창
    public void printMainMenu() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.println((i + 1) + ". " + menus.get(i).getCategory());
        }
        if (!cart.getCartItem().isEmpty()) {
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
        }
        System.out.println("0. 종료");

    }

    // 입력한 숫자에 따라 메뉴 출력
    public void printMenu(Menu menu) {
        System.out.println("[ " + menu.getCategory() + " ]");
        for (int i = 0; i < menu.getMenuItems().size(); i++) {
            MenuItem item = menu.getMenuItems().get(i);
            System.out.printf("%d. %s | W %.1f | %s\n", i + 1,
                    item.getProductName(),
                    (double) item.getProductPrice() / 1000,
                    item.getProductInfo()
            );
        }
        System.out.println("0. 뒤로가기");
    }

    // 카트 보여주고 결제까지
    public void showCart() {
        System.out.println("아래와 같이 주문 하시렵니까? ");
        System.out.println("[ Orders ]");
        for (MenuItem item : cart.getCartItem()) {
            System.out.printf("%s | W %.1f | %s\n",
                    item.getProductName(),
                    (double) item.getProductPrice() / 1000,
                    item.getProductInfo()
            );
        }
        System.out.println("[ Total ]");
        int totalprice = cart.totalPrice();
        System.out.printf("W %.1f\n",
                (double) totalprice
        );
    }
}