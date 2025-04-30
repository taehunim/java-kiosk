package com.taehunim.kiosk.levele;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    // 메소드
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
            }
        }
    }

//
//            if (cart.getCartItem().size() == 0) {
//                // 카테고리 출력
//                outputCategory(categories);
//
//                // 문자열 입력
//                String userInputCategory = inputString();
//
//                // 문자열 정수 변환
//                int userSelectCategoryNumber = changeStringtoInt(userInputCategory);
//
//                // 조건문 사용
//                // 메뉴가 제시된 후 숫자의 입력에 따라 다른 로직을 실행
//                // 반복문을 사용하여 특정 번호가 입력되면 프로그램 종료
//                switch (userSelectCategoryNumber) {
//                    case 0 -> {
//                        break kioskSystem;
//                    }
//                    case 1, 2, 3 -> {
//                        outputMenu(userSelectCategoryNumber);
//                        System.out.println();
//                        String userInputMenu = inputString();
//                        int userSelectMenuNumber = changeStringtoInt(userInputMenu);
//                        selectMenu(userSelectCategoryNumber, userSelectMenuNumber);
//                    }
//                    default -> System.out.println("올바른 값을 입력해주세요.");
//                }
//            } else {
//                // 카테고리 출력
//                outputCategory(categories);
//
//
//                System.out.println("[ ORDER MENU ]");
//                System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
//                System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
//
//                // 문자열 입력
//                String userInputCategory = inputString();
//
//                // 문자열 정수 변환
//                int userSelectCategoryNumber = changeStringtoInt(userInputCategory);
//                switch (userSelectCategoryNumber) {
//                    case 0 -> {
//                        break kioskSystem;
//                    }
//                    case 1, 2, 3 -> {
//                        outputMenu(userSelectCategoryNumber);
//                        System.out.println();
//                        String userInputMenu = inputString();
//                        int userSelectMenuNumber = changeStringtoInt(userInputMenu);
//                        selectMenu(userSelectCategoryNumber, userSelectMenuNumber);
//                    }
//                    case 4 -> {
//                        int result = 0;
//                        System.out.println("[ Orders ]");
//                        for (MenuItem cartitem : cart.getCartItem()) {
//                            System.out.println(cartitem.getProductName() + "\t| W " + (cartitem.getProductPrice() / 1000.0) + " |\t + " + cartitem.getProductInfo());
//                        }
//                        System.out.println("[ Total ]");
//                        for (MenuItem cartitem : cart.getCartItem()) {
//                            result += cartitem.getProductPrice();
//                        }
//                        System.out.println(result);
//                        System.out.println("1. 주문      2. 메뉴판");
//                        int userSelectOrderNumber = changeStringtoInt(inputString());
//                        switch (userSelectOrderNumber) {
//                            case 1 -> {
//                                System.out.println("주문이 완료되었습니다. 금액은 W " + (result * 0.001) + "입니다.");
//                            }
//                            case 2 -> {
//                            }
//                        }
//                    }
//                    case 5 -> cart.removeAllItem();
//                    default -> System.out.println("올바른 값을 입력해주세요.");
//                }
//            }
//        }
//    }


    // 문자열 입력 창
    public int inputInt() {
        try {
            System.out.print("입력 창: ");
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("올바른 숫자를 입력해주세요.");
            return -1;
        }
    }

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

//    public void outputMenu(int userSelectNumber) {
//        List<MenuItem> menuItems = menus.get(userSelectNumber - 1).getMenuItems();
//        System.out.println("[\t" + categories.get(userSelectNumber - 1) + "\t]");
//
//        for (int i = 0; i < menuItems.size(); i++) {
//            MenuItem menuItem = menuItems.get(i);
//            System.out.println((i + 1) + ". " + menuItem.getProductName() + "\t| W " + (menuItem.getProductPrice() / 1000.0) + " |\t" + menuItem.getProductInfo());
//
//        }
//        System.out.println("0. 뒤로가기\t\t\t|  뒤로가기  |");
//    }

    public void printMenu(Menu menu) {
        System.out.println("[ " + menu.getCategory() + " ]");
        for (int i = 0; i < menu.getMenuItems().size(); i++) {
            MenuItem item = menu.getMenuItems().get(i);
            System.out.printf("%d. %s | W %.1f | %s\n", i + 1, item.getProductName(), (double) item.getProductPrice() / 1000, item.getProductInfo());
        }
        System.out.println("0. 뒤로가기");
    }

 /*   public void selectMenu(int userSelectCategoryNumber, int userSelectMenuNumber) {
        List<MenuItem> menuItems = menus.get(userSelectCategoryNumber - 1).getMenuItems();
        if (userSelectMenuNumber == 0) {
        } else if (userSelectMenuNumber <= menuItems.size() && userSelectMenuNumber > 0) {
            MenuItem menuItem = menuItems.get(userSelectMenuNumber - 1);
            System.out.println(menuItem.getProductName() + "\t| W " + (menuItem.getProductPrice() / 1000.0) + " |\t + " + menuItem.getProductInfo());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인 \t\t\t\t 2. 취소");
            int userSelectCartNumber = changeStringtoInt(inputString());
            switch (userSelectCartNumber) {
                case 1 -> {
                    System.out.println(menuItem.getProductName() + " 이 장바구니에 추가되었습니다.");
                    cart.addCart(menuItem);
                }
                default -> {
                }
            }
        } else {
            System.out.println("올바른 값을 입력해주세요");
        }
    }*/

    public void addmenuItems(String category, List<MenuItem> menuItems) {
        menus.add(new Menu(category, menuItems));
    }
}