package apple;

/**
 * Created by sofia on 5/23/16.
 */
public class Iphone {
    private Integer quantity;

    public Iphone(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer cost() {
        Integer cost = this.quantity * 800;
        return cost;
    }
}
