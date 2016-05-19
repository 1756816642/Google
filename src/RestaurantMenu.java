import java.util.HashMap;

/**
 * Created by sofia on 5/15/16.
 */
public class RestaurantMenu {

    HashMap<String, Integer> menuItems;
    String restaurantTitle;
    Integer restaurantRating;

    public RestaurantMenu() {
        menuItems = new HashMap<String, Integer>();
        restaurantTitle = "default";
        restaurantRating = 0;
    }
}
