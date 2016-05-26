import animals.Cat;
import animals.Dog;
import apple.AppleStore;
import apple.Ipad;
import apple.Macbook;

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


//        // Animals
//        Dog dog1 = new Dog();
//        String dogName = dog1.name;
//        dog1.name = "wapple";
//        System.out.println(dog1.name);
//
//        Cat cat1 = new Cat();
//        cat1.name = "momo";
//        System.out.println(cat1.name);
//
//        Cat cat2 = new Cat();
//        cat2.name = "pickles";
//        System.out.println(cat2.name);

        Dog[] dogs = new Dog[4];
        dogs[0] = new Dog("wapple", 2);
        dogs[1] = new Dog("momo", 3);
        dogs[2] = new Dog("appa", 5);
        dogs[3] = new Dog("mochi");

        for (int i=0; i<dogs.length; i++) {
            System.out.println(dogs[i].name);
            System.out.println(dogs[i].age);
        }
        Dog dogZero = dogs[0];
        dogZero.name = "wapple";

        // Apple macbook
        Macbook jacobMac = new Macbook(2);
        Macbook sofiaMac = new Macbook(2);
        System.out.println(jacobMac.cost() + sofiaMac.cost());

        // Apple ipad
        Ipad jacobIpad = new Ipad(1);
        Ipad sofiaIpad = new Ipad(1);
        System.out.println(jacobIpad.cost() + sofiaIpad.cost());

        // Apple applestore
        AppleStore total = new AppleStore();
        total.addItem(jacobMac);
        total.addItem(sofiaMac);
        total.addItem(jacobIpad);
        total.addItem(sofiaIpad);

        System.out.println(total.totalCost());
    }

}
