package lesson7.entities;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    public final static int MAX_QUANTITY_GOODS = 4;
    private Map<String, Integer> basket = new HashMap<>();

    public void put(String goods, Integer price) {
        this.basket.put(goods, price);
    }

    public int getTotalCostOfGoods() {
        return this.basket.values()
                .stream()
                .reduce(0, (x, y) -> x + y);
    }
}
