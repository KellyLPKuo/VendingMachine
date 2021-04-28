import java.util.ArrayList;
import java.util.List;

public class VendingMachine {


    private List<Item> items= new ArrayList<>();
    private double balance;

    public int getSize(){
        return items.size();
    }

    public void addItem(Item item){
        items.add(item);

    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount){
        balance = amount;
    }

    public void withdrawBalance(double amount) throws IllegalArgumentException {
       if (balance > amount ){

           balance -=  amount;
       }
       else{
           throw new IllegalArgumentException("Does not have enough to withdraw");
       }
    }

    public void depositBalance(double amount){
        balance += amount;
    }
}
