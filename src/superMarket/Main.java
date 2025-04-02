package superMarket;
import superMarket.service.serviceImpl.Client;
import superMarket.service.serviceImpl.Product;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        Card card = new Card(1L, "Optima", "KG", 201, 2000, "ab123");
        Basket basket = new Basket(1, product.createProduct());
        Client client = new Client(1, "Jude", "Bellingem", 24, card, basket);
        int c = 0;
        System.out.println("\nWelcome to online market muchacho!");
        while (true) {
            System.out.println("""
                    
                    Select the action: 
                    1. Select product
                    2. Look all products
                    3. Show card balance
                    4. Exit
                    """);
//        while (true) {
//            switch (new Scanner(System.in).nextInt()) {
//                case 1:
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                product.showAllProducts();
                boolean isTrue = true;
                while (isTrue) {
                    Product userProd = null;
                    System.out.println("\nSelect product\n0 - continue");
                    long userProdId = scanner.nextInt();
                    if (userProdId != 0) {
                        for (Product product1 : product.getAllproduct()) {
                            if (product1.getId() == userProdId) {
                                userProd = product1;
                                System.out.println(Arrays.toString(basket.addProduct(userProd)));
                            }
                        }
                        if (userProd == null) {
                            System.out.println("Invalid id, try again");
                        }
                    } else {
                        isTrue = false;
                    }
                }
//                todo check:
                client.payWithCard(card, basket.userBasket);
//                case 2:
//                    System.out.println("test2");
//                    break;
//                case 3:
//                    System.out.println("test3");
//                    break;
//            }
            } else if (userChoice == 2) {
                product.showAllProducts();
            } else if (userChoice == 3) {
                System.out.println("Your balance = " + client.getCardBalance(card));
            } else if (userChoice == 4) {
                return;
            } else {
                System.out.println("Invalid value, try again!");
            }
        }
    }
}


