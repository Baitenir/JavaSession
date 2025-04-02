package Polimorphism.task3;

public class Bank {
    private int balance = 350000;

    public Bank() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void sendMoney (int sendMoney){
        if (balance > sendMoney){
        setBalance(getBalance() - sendMoney);
        System.out.println("Successful send");
        showBalance();
        } else {
            System.out.println("Error");
        }

    }

    public void getUserMoney (int getMoney){
        setBalance(getBalance() + getMoney);
    }

    public void showBalance (){
        System.out.println("Your balance: "+ balance);
    }
}
