package superMarket.service.serviceImpl;

import superMarket.service.ProductInterface;

public class Product implements ProductInterface {
    private long id;
    private String productName;
    private int price;

    public Product() {
    }

    public Product(long id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    // todo methods:

    public Product[] createProduct() {
        Product product1 = new Product(1, "Potato", 70);
        Product product2 = new Product(2, "Tomato", 65);
        Product product3 = new Product(3, "Chocolate", 90);
        Product product4 = new Product(4, "Milk", 70);
        Product product5 = new Product(5, "Bread", 30);
        Product product6 = new Product(6, "butter", 120);
        Product product7 = new Product(7, "Juice", 100);
        Product product8 = new Product(8, "Cake", 890);
        Product product9 = new Product(9, "Cookie", 110);
        return new Product[]{product1, product2, product3, product4, product5, product6, product7, product8, product9};
    }

    public Product[] getAllproduct(){
        return createProduct();
    }



    public void checkForUserProducts(Product[] basket){
        System.out.println("------CHECK------");
        for (Product basket1 : basket) {
            if (basket1 != null){
                System.out.println("Product id:     "+basket1.getId());
                System.out.println("Product name:   " + basket1.getProductName());
                System.out.println("price:          "+basket1.getPrice());
                System.out.println();
            }
        }
    }

    public void showAllProducts(){
        for (Product product : createProduct()) {
            System.out.println("Product id = " + product.getId() + ", Name product = " + product.getProductName()+ ", Price = " + product.getPrice());
        }
    }


    @Override
    public Product[] delete(long id, Product[] userBasket) {
        int index = -1;
        int i =0;
        Product[] newUserBasket = new Product[userBasket.length];
        for (Product product : userBasket) {
            if (product.getId() == id){
                index =i;
            }
            i++;
        }
        for (int i1 = 0; i1 < newUserBasket.length; i1++) {
            if (i1 == index){
                continue;
            }
             userBasket[i1] = newUserBasket[i1];
        }
        userBasket = newUserBasket;
        return userBasket;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
