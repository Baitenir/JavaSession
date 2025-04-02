package superMarket;
import superMarket.service.serviceImpl.Product;
import java.util.Arrays;

public class Basket {
    private long id;
    private Product[] products;

    public Basket() {
    }

    public Basket(long id, Product[] products) {
        this.id = id;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    Product[] userBasket = new Product[9];
    int c = 0;
    public Product[] addProduct (Product product){
        userBasket[c++] = product;
        System.out.println("Your basket: ");
        return userBasket;
    }


    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
