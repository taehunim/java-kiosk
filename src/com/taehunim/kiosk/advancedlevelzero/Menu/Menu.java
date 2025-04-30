package com.taehunim.kiosk.advancedlevelzero.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    // 속성
    Map<String, List<MenuItem>> menuDb = new HashMap<>();


    // 생성자

    // 기능
    // 카테고리 중복 체크
    public void newCategory(String categoryName) {
        if(!menuDb.containsKey(categoryName)) {

        }
    }

    }
}
