package lesson7.entities;

import java.util.stream.IntStream;

import lesson7.interfaces.IBuyer;
import lesson7.interfaces.IUseBasket;
import lesson7.utils.Randomaizer;

public class Buyer implements IBuyer, IUseBasket, Runnable {

    private String name;
    private Basket basket;

    public Buyer(String name) {
        this.name = name;
    }

    private void fillBasket() {
        int quantityGoods = Randomaizer.getRandomValue(1, Basket.MAX_QUANTITY_GOODS+1);
        IntStream.range(0, quantityGoods)
                .forEach(i -> {
                    try {
                        this.chooseGoods();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }}); 
    }

    @Override
    public void takeBasket() throws InterruptedException {
        this.basket = new Basket();
        Thread.sleep((long) Randomaizer.getRandomValue(500, 2000));
    }

    @Override
    public void putGoodsToBasket(String goods, Integer price) throws InterruptedException {
        this.basket.put(goods, price);
        Thread.sleep((long) Randomaizer.getRandomValue(500, 2000));
    }

    @Override
    public void enterToMarket() {
        System.out.println("Покупатель %s вошел в магазин"
                .formatted(this.name));
    }

    @Override
    public void chooseGoods() throws InterruptedException {
        int goodsIndex = Randomaizer.getRandomValue(0, Market.getQuantityGoods()-1);
        String goodsName = Market.getGoodsNameByIndex(goodsIndex);

        System.out.println("Покупатель %s выбрал товар: %s"
                .formatted(this.name, goodsName));

        Thread.sleep((long) Randomaizer.getRandomValue(500, 2000));

        this.putGoodsToBasket(goodsName, Market.goods.get(goodsName));
    }

    @Override
    public void goOut() {
        System.out.println("Покупатель %s вышел из магазина"
                .formatted(this.name));

        int totalCost = this.basket.getTotalCostOfGoods();
        System.out.println("Стоимость товара в корзине %s: %d"
                .formatted(this.name, totalCost));
    }

    @Override
    public void run() {
        try {
            this.enterToMarket();
            this.takeBasket();
            this.fillBasket();
            this.goOut();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
