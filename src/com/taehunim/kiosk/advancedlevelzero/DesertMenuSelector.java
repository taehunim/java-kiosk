package com.taehunim.kiosk.advancedlevelzero;

import java.util.ArrayList;
import java.util.List;

public class DesertMenuSelector implements MenuSelector {
    @Override
    public List<MenuItem> getMenuItems() {
        List<MenuItem> details = new ArrayList<>();
        details.add(new MenuItem(
                        "아이스크림 콘",
                        1300,
                        "바삭한 콘 위에 부드럽게 올라간 달콤한 아이스크림."
                )
        );
        details.add(new MenuItem(
                        "맥 플러리",
                        3600,
                        "진한 아이스크림에 다양한 토핑을 섞어 즐기는 디저트."
                )
        );
        details.add(new MenuItem(
                        "오레오 아포가토",
                        4100,
                        "바닐라 아이스크림에 에스프레소와 오레오 크럼블을 더한 달콤 쌈쌀한 디저트"
                )
        );
        details.add(new MenuItem(
                        "선데이 아이스크림",
                        2300,
                        "부드러운 아이스크림에 달콤한 시럽을 더한 클래식 디저트"
                )
        );
        return details;
    }
}
