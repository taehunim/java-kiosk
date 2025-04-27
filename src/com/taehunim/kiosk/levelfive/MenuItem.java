package com.taehunim.kiosk.levelfive;

/**
 * kiosk의 음식 메뉴 정보를 제공하는 Menuitem입니다.
 * 이름 , 정보, 가격 세가지 필드를 가지고 있습니다.
 * 생성자를 통해 이를 외부에서 주입받습니다.
 * getter를 통해 외부에 정보를 전달할 수 있습니다.
 * setter를 통해 외부에서 상품의 가격을 조정할 수 있습니다.
 */
public class MenuItem {

    // 속성
    private final String goodsName;
    private final String goodsInfo;
    private int goodsPrice;

    // 생성자
    MenuItem(String goodsName, int goodsPrice, String goodsInfo) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsInfo = goodsInfo;
    }

    // 기능
    // 저장한 이름을 꺼내주는 기능
    public String getGoodsName() {
        return goodsName;
    }

    // 저장한 가격을 꺼내주는 기능
    public int getGoodsPrice() {
        return goodsPrice;
    }

    // 저장한 설명을 꺼내주는 기능
    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsPrice(int goodsPrice) {
        if (goodsPrice > 0) {
           this.goodsPrice = goodsPrice;
        } else {
            System.out.println("올바른 값을 입력하세요.");
        }
    }
}
