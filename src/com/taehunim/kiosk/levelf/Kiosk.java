package com.taehunim.kiosk.levelf;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

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

                    // 할인 정보 출력
                    System.out.println("할인 정보를 입력해주세요.");
                    for (UserType userType : UserType.values()) {
                        int i = 1;
                        System.out.println(i + ". " + userType.name() + " : " + userType.getDiscountRate() * 100 + "%");
                    }

                    // 할인률 선택 후 계산
                    int typeSelect = inputInt();
                    if (typeSelect >= 1 && typeSelect <= UserType.values().length) {
                        System.out.println("주문이 완료되었습니다.");
                        System.out.print("금액은 ");
                        double totalPrice = (double) cart.totalPrice();
                        double discountRate = (1 - UserType.values()[typeSelect - 1].getDiscountRate());
                        double realTotalPrice = totalPrice * discountRate;
                        System.out.printf("W %.1f", realTotalPrice);
                        System.out.println(" 입니다\n");
                        cart.clearCart();
                    }

                }

            } else if (categorySelect == 5 && !cart.getCartItem().isEmpty()) {
                System.out.println("입력한 상품을 취소합니다.");
                String nameInput = scanner.nextLine();
                boolean whichDisplay = cart.removeItem(nameInput);
                if (whichDisplay == true) {
                    System.out.println(nameInput + " 삭제완료");
                } else {
                    System.out.println("해당 항목이 없습니다.");
                }
            } else if (categorySelect == 6 && !cart.getCartItem().isEmpty()) {
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
        AtomicInteger categoryNumber = new AtomicInteger(1);
        System.out.println("[ MAIN MENU ]");
        menus.stream().map(menu -> menu.getCategory()).
                forEach(category -> {
                            System.out.println(categoryNumber + ". " + category);
                            // 람다 안에서는 람다 철학을 준수하기 위해 외부의 값을 수정하지 못하게 막아논것이다.
                            // 람다는 외부 변수들을 final형식으로 받아드린다.
                            // 그렇기에 기본형으로 할당된 변수는 아예 건드릴 수 없기 때문에 래퍼클래스를 사용한다.
                            // 이후 메소드를 사용하여 간접적으로 값을 변경할 수 있다.
                            categoryNumber.getAndIncrement();
                        }
                );


        if (!cart.getCartItem().isEmpty()) {
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Item Cancel  | 특정 항목을 제거합니다.");
            System.out.println("6. Cancel       | 진행중인 주문을 취소합니다.");

        }
        System.out.println("0. 종료");

    }

    // 입력한 숫자에 따라 메뉴 출력
    public void printMenu(Menu menu) {
        System.out.println("[ " + menu.getCategory() + " ]");
        AtomicInteger menuNumber = new AtomicInteger(1);
        menu.getMenuItems().stream().
                forEach(item -> {
                            System.out.printf("%d. %s | W %.1f | %s\n",
                                    menuNumber.get(),
                                    item.getProductName(),
                                    (double) item.getProductPrice() / 1000,
                                    item.getProductInfo()
                            );
                            menuNumber.getAndIncrement();
                        });
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