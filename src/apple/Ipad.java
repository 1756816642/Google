package apple;

/**
 * Created by sofia on 5/23/16.
 */
public class Ipad {
    Integer quantity;

    public Ipad(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer cost() {
        Integer cost = this.quantity * 500;
        return cost;
    }
}
