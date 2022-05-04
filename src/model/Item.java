package model;

public class Item {

    int itemID;
    int quantity;
    double itemPrice;
    double VAT;
    String itemDetails;

    public Item (Item item)
    {
        this.itemPrice = item.itemPrice;
        this.quantity = +1;
        this.itemID = item.itemID;
        this.itemDetails = item.itemDetails;
        this.VAT = item.VAT;
    }

    public Item (int id, int quantity, double price, double vat, String iList) // iList = details
    {
        this.itemPrice = price;
        this.quantity = quantity;
        this.itemID = id;
        this.itemDetails = iList;
        this.VAT = vat;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public String toString()
    {
        String string = "";
        string += this.quantity;
        string += " "+ this.itemID;
        string += " " + this.itemPrice + "USD";
        return string;
    }
 
}
