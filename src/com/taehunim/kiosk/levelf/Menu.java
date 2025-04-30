package com.taehunim.kiosk.levelf;

import java.util.List;

public class Menu {
    private final String category;
    private final List<MenuItem> menuItems;

    public Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }
}
