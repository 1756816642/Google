package zoo;

import java.util.ArrayList;

/**
 * Created by sofia on 6/5/16.
 */
public class Zoo {
    public ArrayList<Gorilla> gorillas;
    public ArrayList<Elephant> elephants;

    public Zoo() {
        gorillas = new ArrayList<Gorilla>();
        elephants = new ArrayList<Elephant>();
    }

    public void addAnimals(Gorilla gorilla) {
        gorillas.add(gorilla);
    }

    public void addAnimals(Elephant elephant) {
        elephants.add(elephant);
    }
}
