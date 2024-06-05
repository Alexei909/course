package lesson7.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Market {

    public static final Map<String, Integer> goods;
    private static final List<String> goodsName;

    static {
        goods = new HashMap<>();
        goods.put("Молоко", 100);
        goods.put("Хлеб", 50);
        goods.put("Масло", 200);
        goods.put("Сахар", 300);
        goods.put("Колбаса", 250);
        goods.put("Вода", 80);
        goods.put("Соль", 150);

        goodsName = goods.entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .toList();
    }

    public static String getGoodsNameByIndex(Integer index) {
        return goodsName.get(index);
    }
    
    public static int getQuantityGoods() {
        return goodsName.size();
    }
}
