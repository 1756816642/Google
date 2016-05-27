package apple;

/**
 * Created by sofia on 5/23/16.
 */
public class Macbook {
    private Integer quantity;
    private String model;

    public Macbook(Integer quantity, String model) {
        this.quantity = quantity;
        this.model = model;
    }

    public Integer cost() {
        Integer cost = 0;
        if (this.model == "pro") {
            cost = cost + (this.quantity * 2500);
        } else if (this.model == "air") {
            cost = cost + (this.quantity * 1600);
        }
        return cost;
    }
}
