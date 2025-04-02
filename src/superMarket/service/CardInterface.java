package superMarket.service;
import superMarket.Card;
import superMarket.service.serviceImpl.Product;

public interface CardInterface {

    void payWithCard(Card card, Product[] basket);

    double getCardBalance(Card card);
}
