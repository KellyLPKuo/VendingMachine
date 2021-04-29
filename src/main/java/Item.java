public class Item {

    private String itemName;
    private double price;
    //private int quantity;
    private String code;

    public Item(){}
    public Item(String itemName, double price , String code){
        this.itemName = itemName;
        this.price = price;
      //  this.quantity = quantity;
        this.code = code;
    }

    public String getCode (){
        return code;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

}
