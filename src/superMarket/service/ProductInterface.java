package superMarket.service;

import superMarket.service.serviceImpl.Product;

public interface ProductInterface {
    Product[] delete (long id, Product[] userBasket);
}
