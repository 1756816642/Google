package apple;

/**
 * Created by sofia on 5/23/16.
 */
public class Ipad {
    private Integer quantity;
    private String model;

    public Ipad(Integer quantity, String model) {
        this.quantity = quantity;
        this.model = model;
    }

    public Integer cost() {
        Integer cost = 0;
        if (this.model == "pro") {
            cost = cost + (this.quantity * 1000);
        } else if (this.model == "mini") {
            cost = cost + (this.quantity * 500);
        } else {
            cost = cost + (this.quantity * 500);
        }

        return cost;
    }
}
