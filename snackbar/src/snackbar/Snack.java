package snackbar;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private BigDecimal cost;
    private int vendingID;

    public Snack(String name, int quantity, BigDecimal cost, int vendingID){
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void addQuantity(int quantity){
        this.quantity += quantity;
    }
    public void buySnack(int quantity){
        this.quantity -= quantity;
    }
    public BigDecimal getTotalCost(int quantity){
        return this.cost * quantity;
    }
}