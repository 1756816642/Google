package zoo;

import java.util.ArrayList;

/**
 * Created by sofia on 6/5/16.
 */
public class Zoo {
    public ArrayList<Mammal> mammals;
    public ArrayList<Reptile> reptiles;
//    public ArrayList<Reptile> reptiles = new ArrayList<Reptile>();
    public ArrayList<AquaticAnimal> aquaticAnimals;

    public Zoo() {
        mammals = new ArrayList<Mammal>();
        reptiles = new ArrayList<Reptile>();
        aquaticAnimals = new ArrayList<AquaticAnimal>();
    }

    public void addAnimals(Mammal mammal) {
        mammals.add(mammal);
    }

    public void addAnimals(Reptile reptile) {
        reptiles.add(reptile);
    }

    public void addAnimals(AquaticAnimal aquaticAnimal) {
        aquaticAnimals.add(aquaticAnimal);
    }

}
