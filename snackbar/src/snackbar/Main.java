package snackbar;

public class Main {
    private static void completeTransactions(){
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.id);
        Snack chocolateBar  = new Snack("Chocolate Bar", 36, 1.00, food.id);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.id);
        Snack soda = new Snack("Soda", 24, 2.50, drink.id);
        Snack water = new Snack("Water", 20, 2.75, drink.id);

        jane.buyGivenCashUsed(soda.getTotalCost(3));
        soda.buySnack(3);
        System.out.println("Jane cash on hand: " + jane.getCashOnHand());
        System.out.println("Quantity of soda: " + soda.getQuantity());

        jane.buyGivenCashUsed(pretzel.getTotalCost(1));
        pretzel.buySnack(1);
        System.out.println("Jane cash on hand: " + jane.getCashOnHand());
        System.out.println("Quantity of pretzels: " + pretzel.getQuantity());

        bob.buyGivenCashUsed(soda.getTotalCost(2));
        soda.buySnack(2);
        System.out.println("Bob cash on hand: " + bob.getCashOnHand());
        System.out.println("Quantity of soda: " + soda.getQuantity());

        jane.addCash(10.00);
        System.out.println("Jane cash on hand: " + jane.getCashOnHand());

        jane.buyGivenCashUsed(chocolateBar.getTotalCost(1));
        chocolateBar.buySnack(1);
        System.out.println("Jane cash on hand: " + jane.getCashOnHand());
        System.out.println("Quantity of chocolate bars: " + chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println("Quantity of pretzels: " + pretzel.getQuantity());

        bob.buyGivenCashUsed(pretzel.getTotalCost(3));
        pretzel.buySnack(3);
        System.out.println("Bob cash on hand: " + bob.getCashOnHand());
        System.out.println("Quantity of pretzels: " + pretzel.getQuantity());
    }
    public static void main(String[] args){
        completeTransactions();
    }
}