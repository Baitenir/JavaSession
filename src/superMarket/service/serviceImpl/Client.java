package superMarket.service.serviceImpl;

import superMarket.Basket;
import superMarket.Card;
import superMarket.service.CardInterface;

public class Client implements CardInterface{
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;
    private Basket basket;

    public Client() {
    }

    public Client(long id, String firstName, String lastName, int age, Card card, Basket basket) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void payWithCard(Card card, Product[] basket) {
        Product product = new Product();
        double allPrice = 0;
        for (Product userBasket : basket) {
            if (userBasket != null) {
            allPrice += userBasket.getPrice();
        }}
        if (allPrice !=0){
        if (allPrice <= card.getBalance()){
            product.checkForUserProducts(basket);
            System.out.println("_______________________________________________");
            System.out.println("Your all product price: " + allPrice);
            System.out.println("Your balance: " + card.getBalance());
            System.out.println("You successful pay!");
            card.setBalance(card.getBalance()- allPrice);
            System.out.println("Your balance now: " + card.getBalance());
        } else {
            System.out.println("Your balance: " + card.getBalance());
            System.out.println("Your all product price: " + allPrice);
            System.out.println("You don't pay for all product!");
            System.out.println("You need else: " + (card.getBalance() - allPrice));
        }} else {
            System.out.println("Please choice product!");
        }
    }

    @Override
    public double getCardBalance(Card card) {
        return card.getBalance();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", card=" + card +
                ", basket=" + basket +
                '}';
    }





}
