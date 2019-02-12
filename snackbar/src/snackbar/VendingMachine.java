package snackbar;

public class VendingMachine {
    private static int maxId = 0;
    public int id;
    private String name;

    VendingMachine(String name){
        maxId++;
        id = maxId;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}