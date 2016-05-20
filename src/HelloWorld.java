import java.util.HashMap;

/**
 * Created by sofia on 5/14/16.
 */

public class HelloWorld {
    public static void main(String[] arg) {
        RestaurantMenu menu1 = new RestaurantMenu();
        RestaurantMenu menu2 = new RestaurantMenu();
        menu1.restaurantTitle = "Restaurant XYZ";
        menu1.menuItems.put("sandwich", 10);
        menu1.menuItems.put("salad", 11);
        menu1.menuItems.put("pasta", 12);
        menu1.menuItems.put("soup", 9);

        menu2.restaurantTitle = "Restaurant ABC";
        menu2.menuItems.put("sushi", 15);
        menu2.menuItems.put("teriyaki chicken", 12);
        menu2.menuItems.put("edamame", 5);
        menu2.menuItems.put("miso soup", 4);
        menu2.menuItems.put("ramen noodles", 12);
        menu2.menuItems.put("dessert", 5);

        // print out all menu items
        for (String item : menu1.menuItems.keySet()) {
            System.out.println(item);
        }

        // print out restaurant title
        Restaurant r = new Restaurant();
        System.out.println(r.menu.restaurantTitle);

        // print out rating of restaurant based on menu1
        Restaurant xyzRating = new Restaurant();
        for (String item : menu1.menuItems.keySet()) {
            if (item == "dessert") {
                xyzRating.rating.restaurantRating = xyzRating.rating.restaurantRating + 3;
            }
        }
        System.out.println("Restaurant XYZ's rating is: " + xyzRating.rating.restaurantRating);

        // print out rating of restaurant based on menu2
        Restaurant abcRating = new Restaurant();
        for (String item : menu2.menuItems.keySet()) {
            if (item == "dessert") {
                abcRating.rating.restaurantRating = abcRating.rating.restaurantRating + 3;
            }
        }
        System.out.println("Restaurant ABC's rating is: " + abcRating.rating.restaurantRating);


        // Animals
        Animals dog1 = new Animals();
        dog1.dog = "wapple";
        System.out.println(dog1.dog);
    }

}
