package zoo;

import java.util.ArrayList;

/**
 * Created by sofia on 6/5/16.
 */
public class Zoo {
    public ArrayList<Mammal> mammals;

    public Zoo() {
        mammals = new ArrayList<Mammal>();
    }

    public void addAnimals(Mammal mammal) {
        mammals.add(mammal);
    }
}
