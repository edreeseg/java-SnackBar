package snackbar;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    Customer(String name, double cashOnHand){
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    public void addCash(double amount){
        this.cashOnHand += amount;
    }
    public void buyGivenCashUsed(double amount){
        this.cashOnHand -= amount;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getCashOnHand(){
        return this.cashOnHand;
    }
}