package apple;

/**
 * Created by sofia on 5/27/16.
 */
public class Imac {
    private Integer quantity;

    public Imac(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer cost() {
        Integer cost = this.quantity * 4500;
        return cost;
    }
}
