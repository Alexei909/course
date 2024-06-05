package lesson7.interfaces;

public interface IUseBasket {
    void takeBasket() throws InterruptedException;
    void putGoodsToBasket(String goods, Integer price) throws InterruptedException;
}
