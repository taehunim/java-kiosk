package com.taehunim.kiosk.advancedlevelone;

import java.util.ArrayList;
import java.util.List;

public class BurgerMenuSelector implements MenuSelector {
    @Override
    public List<MenuItem> getMenuItems() {
        List<MenuItem> details = new ArrayList<>();
        details.add(new MenuItem(
                        "불고기 버거",
                        3400,
                        "달콤한 불고기 소스를 곁들인 한국 스타일의 소고기 버거."
                )
        );
        details.add(new MenuItem(
                        "베이컨 토마토 디럭스",
                        5800,
                        "신선한 토마토와 베이컨이 어우러진 프리미엄 클래식 버거."
                )
        );
        details.add(new MenuItem(
                        "빅맥",
                        5500,
                        "특제 소스와 두 장의 비프 패티가 조화를 이루는 맥도날드의 시그니처 버거."

                )
        );
        details.add(new MenuItem(
                        "햄버거",
                        2600,
                        "전 세계인이 사랑하는 빠르고 간편한 클래식 버거."
                )
        );
        return details;
    }
}
