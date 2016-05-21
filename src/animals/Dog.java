package animals;

/**
 * Created by sofia on 5/21/16.
 */
public class Dog {
    public String name;
    public Integer age;
    public DogBreeds breed;

    public Dog(String dogName, Integer dogAge) {
        name = dogName;
        age = dogAge;
        breed = DogBreeds.GermanShepard;
    }

    public Dog(String dogName) {
        this(dogName, 0);
    }
}
