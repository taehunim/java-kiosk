package com.taehunim.kiosk.advancedlevelzero;

import java.util.ArrayList;
import java.util.List;

public class DrinkMenuSelector implements MenuSelector {
    @Override
    public List<MenuItem> getMenuItems() {
        List<MenuItem> details = new ArrayList<>();
        details.add(new MenuItem(
                        "코카콜라",
                        1900,
                        "전 세계에서 가장 사랑받는 청량감 넘치는 탄산음료."
                )
        );
        details.add(new MenuItem(
                        "미닛머메이드 오렌지",
                        1500,
                        "상큼한 오렌지의 풍미를 그대로 담은 과즙 음료."
                )
        );
        details.add(new MenuItem(
                        "밀크 쉐이크",
                        2800,
                        "부드러운 우유와 달콤한 맛이 조화를 이룬 시원한 음료"
                )
        );
        details.add(new MenuItem(
                        "순수 생수",
                        1300,
                        "깨끗함과 신선함을 담은 순수한 물."
                )
        );
        return details;
    }
}
