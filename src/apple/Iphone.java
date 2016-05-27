package apple;

/**
 * Created by sofia on 5/23/16.
 */
public class Iphone {
    private Integer quantity;
    private String model;

    public Iphone(Integer quantity, String model) {
        this.quantity = quantity;
        this.model = model;
    }

    public Integer cost() {
        Integer cost = 0;
        if (this.model == "5" || this.model == "5s") {
            cost = cost + (this.quantity * 700);
        } else if (this.model == "6" || this.model == "6s") {
            cost = cost + (this.quantity * 1000);
        } else {
            cost = cost + (this.quantity * 800);
        }
        return cost;
    }
}
