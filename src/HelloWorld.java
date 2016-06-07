import animals.Dog;
import apple.*;
import zoo.*;

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
        Macbook jacobMac = new Macbook(2, "pro");
        Macbook sofiaMac = new Macbook(2, "air");
        System.out.println("Total macbook cost: " + (jacobMac.cost() + sofiaMac.cost()));

        // Apple ipad
        Ipad jacobIpad = new Ipad(1, "pro");
        Ipad sofiaIpad = new Ipad(1, "mini");
        System.out.println("Total ipad cost: " + (jacobIpad.cost() + sofiaIpad.cost()));

        // Apple iphone
        Iphone jacobIphone = new Iphone(3, "5");
        Iphone sofiaIphone = new Iphone(1, "6");
        System.out.println("Total iphone cost: " + (jacobIphone.cost() + sofiaIphone.cost()));

        // Apple imac
        Imac jsImac = new Imac(1);
        System.out.println("Total imac cost: " + jsImac.cost());

        // Apple applestore
        ShoppingCart total = new ShoppingCart();
        total.addItem(jacobMac);
        total.addItem(sofiaMac);
        total.addItem(jacobIpad);
        total.addItem(sofiaIpad);
        total.addItem(jacobIphone);
        total.addItem(sofiaIphone);
        total.addItem(jsImac);

        AppleStore store = new AppleStore();
        store.items = total;

        System.out.println("Total iThings cost: " + total.totalCost());

        // Zoo animals
        Gorilla gorilla1 = new Gorilla();
        gorilla1.name = "coco";
        Gorilla gorilla2 = new Gorilla();
        gorilla2.name = "mimi";
        Elephant elephant1 = new Elephant();
        elephant1.name = "dumbo";
        elephant1.trunkLength = 20;
        Elephant elephant2 = new Elephant();
        elephant2.name = "flappy";
        elephant2.trunkLength = 25;
        Elephant elephant3 = new Elephant();
        elephant3.name = "stompper";
        elephant3.trunkLength = 30;

        Zoo zoo1 = new Zoo();
        zoo1.addAnimals(gorilla1);
        zoo1.addAnimals(elephant1);
        zoo1.addAnimals(gorilla2);
        zoo1.addAnimals(elephant2);
        zoo1.addAnimals(elephant3);
        System.out.println(zoo1.mammals);

        for (Mammal animal : zoo1.mammals) {
            if (animal.type.equals("elephant")) {
                Elephant e = (Elephant) animal;
                System.out.println("trunk length: " + e.trunkLength);
            }
            System.out.println("animal type: " + animal.type);
            System.out.println("name: " + animal.name);
            System.out.println("------------");
        }
    }

}
