package apple;

import java.util.ArrayList;

/**
 * Created by sofia on 5/25/16.
 */
public class ShoppingCart {
    ArrayList<Macbook> macbooks = new ArrayList<Macbook>();
    ArrayList<Ipad> ipads = new ArrayList<Ipad>();
    ArrayList<Iphone> iphones = new ArrayList<Iphone>();


    public void addItem(Macbook macbook) {
        macbooks.add(macbook);
    }

    public void addItem(Ipad ipad) {
        ipads.add(ipad);
    }

    public void addItem(Iphone iphone) {
        iphones.add(iphone);
    }

    public Integer totalCost() {
        Integer totalCost = 0;
        for (Macbook macbook : macbooks) {
            totalCost = totalCost + macbook.cost();
        }
        for (Ipad ipad : ipads) {
            totalCost = totalCost + ipad.cost();
        }
        for (Iphone iphone : iphones) {
            totalCost = totalCost + iphone.cost();
        }
        return totalCost;
    }
}
