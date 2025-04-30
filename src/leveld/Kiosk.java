package leveld;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private final List<Menu> menus = new ArrayList<>();
    private final Scanner scanner;
    private final List<String> categories = new ArrayList<>();

    // 생성자
    public Kiosk(Scanner scanner, Menu burgerMenu, Menu drinkMenu, Menu desertMenu) {
        this.scanner = scanner;
        this.menus.add(burgerMenu);
        this.menus.add(drinkMenu);
        this.menus.add(desertMenu);
        for (int i = 0; i < menus.size(); i++)
            categories.add(menus.get(i).getCategory());
    }

    // 메소드
    public void start() {
        kioskSystem:
        while (true) {

            // 카테고리 출력
            outputCategory(categories);

            // 문자열 입력
            String userInput = inputString();

            // 문자열 정수 변환
            int userSelectNumber = changeStringtoInt(userInput);

            // 조건문 사용
            // 메뉴가 제시된 후 숫자의 입력에 따라 다른 로직을 실행
            // 반복문을 사용하여 특정 번호가 입력되면 프로그램 종료
            switch (userSelectNumber) {
                case 0 -> {
                    break kioskSystem;
                }
                case 1, 2, 3, 4 -> {
                    List<MenuItem> menuItems = menus.get(userSelectNumber - 1).getMenuItems();
                    System.out.println("[\t" + categories.get(userSelectNumber - 1) + "\t]");

                    for (int i = 0; i < menuItems.size(); i++) {
                        MenuItem menuItem = menuItems.get(i);
                        System.out.println((i + 1) + ". " + menuItem.getProductName() + "\t| W " + (menuItem.getProductPrice() / 1000.0) + " |\t + " + menuItem.getProductInfo());
                    }
                }
                default -> System.out.println("올바른 값을 입력해주세요.");
            }
        }
    }

    // 문자열 정수 변환 메소드
    public int changeStringtoInt(String userInput) {
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("올바른 값을 입력해주세요.");
            return -1;
        }
    }

    // 문자열 입력 창
    public String inputString() {
        System.out.print("입력 창: ");
        return scanner.nextLine();
    }

    // 카테고리 출력
    public void outputCategory(List<String> categories) {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }
        System.out.println("0. 종료\t\t\t|  종료  |");
    }
}