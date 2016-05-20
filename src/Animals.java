import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sofia on 5/18/16.
 */
public class Animals {
    HashMap<String, Integer> animalTypes;
    String cat;
    String dog;
    String bird;

    public Animals() {
        animalTypes = new HashMap<String, Integer>();
        cat = "catZero";
        dog = "dogZero";
        bird = "birdZero";
    }

    /*
    public static void main(String[] arg) {
        ArrayList<String> allAnimals = new ArrayList<String>();
        allAnimals.add("dog");
        allAnimals.add("cat");
        allAnimals.add("bird");
        allAnimals.add("fish");
        System.out.println(allAnimals.get(2));
    } */
}
