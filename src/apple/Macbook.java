package apple;

/**
 * Created by sofia on 5/23/16.
 */
public class Macbook {
    public Integer cost;
    public Integer quantity;

    public Macbook(Integer quantity) {
        this.quantity = quantity;
        this.cost = 2000 * quantity;
    }
}
