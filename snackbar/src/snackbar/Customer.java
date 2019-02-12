package snackbar;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private BigDecimal cashOnHand;

    Customer(String name, BigDecimal cashOnHand){
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    public void addCash(BigDecimal amount){
        this.cashOnHand += amount;
    }
    public void buyGivenCashUsed(BigDecimal amount){
        this.cashOnHand -= amount;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public BigDecimal getCashOnHand(){
        return this.cashOnHand;
    }
}