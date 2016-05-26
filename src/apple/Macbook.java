package apple;

/**
 * Created by sofia on 5/23/16.
 */
public class Macbook {
    private Integer quantity;

    public Macbook(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer cost() {
        Integer cost = this.quantity * 2000;
        return cost;
    }
}
