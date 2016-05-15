import java.util.HashMap;

/**
 * Created by sofia on 5/14/16.
 */

public class HelloWorld {
    public static void main(String[] arg) {
        RestaurantMenu menu1 = new RestaurantMenu();
        RestaurantMenu menu2 = new RestaurantMenu();
        menu1.restaurantTitle = "Restaurant ABC";
        menu1.menuItems.put("sandwich", 10);
        menu1.menuItems.put("salad", 8);
        menu2.restaurantTitle = "Restaurant XYZ";
        menu2.menuItems.put("sushi", 15);
        menu2.menuItems.put("teriyaki chicken", 12);

        for (String item : menu1.menuItems.keySet()) {
            System.out.println(item);
        }
    }

}
