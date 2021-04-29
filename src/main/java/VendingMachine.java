import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VendingMachine {


    private HashMap<String, Item> items= new HashMap<>();
    private double balance;

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void addCustomerBalance(double customerBalance) throws IllegalArgumentException {
        if(customerBalance <= 0 ){
            throw new IllegalArgumentException("invalid input");
        }
        this.customerBalance += customerBalance;

    }

    private double customerBalance;
    public int getSize(){
        return items.size();
    }

    public void addItem(Item item) throws IllegalArgumentException{
        if(!items.containsKey(item.getCode()) )
             items.put(item.getCode(), item);
        else{
            throw new IllegalArgumentException("duplicate codes");
        }

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
           throw new IllegalArgumentException("Insufficient money");
       }
    }

    public void depositBalance(double amount){
        balance += amount;
    }

    public List<Item> getAvailableItems() {
       if(items.isEmpty()){
           return new ArrayList<Item>();
       }
       return new ArrayList<Item>( items.values());
    }

    public Item buyItem(String itemCode) throws IllegalArgumentException  {
        Item item=null ;
        if(!items.containsKey(itemCode))
            throw new IllegalArgumentException("No such item");
        item = items.get(itemCode);
        if(item.getPrice() > customerBalance){
            throw new IllegalArgumentException("Insufficient money");
        }
        customerBalance-= item.getPrice();
       balance += item.getPrice();
        return item;
    }
   public double getChange(){
        return getCustomerBalance();
   }

   public double cancelPurchased(){
        return getChange();
   }

}
