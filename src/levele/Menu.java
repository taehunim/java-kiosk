package levele;

import java.util.List;

public class Menu {

    private final String category;
    private final List<MenuItem> menuItems;

    Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }

    public String getCategory() {
        return category;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}



