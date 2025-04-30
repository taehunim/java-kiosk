package levele;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<MenuItem> cartItem = new ArrayList<>();

    public void addCart (MenuItem menuItem) {
        cartItem.add(menuItem);
    }

    public void removeAllItem () {
        cartItem.clear();
    }
}
