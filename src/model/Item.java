package model;

/** Metod som samlar produktens variabler.
 * 
 */
public class Item {

    int itemID;
    int quantity;
    double itemPrice;
    double VAT;
    String itemDetails;

/** constructor
 * 
 * @param item
 */
    public Item (Item item)
    {
        this.itemPrice = item.itemPrice;
        this.quantity = +1;
        this.itemID = item.itemID;
        this.itemDetails = item.itemDetails;
        this.VAT = item.VAT;
    }

    // skapar en "deep copy" läggs sedan till i köpet.
    public Item (int q, double price, double vat, String details, int id) // iList = details
    {
        this.itemPrice = price;
        this.quantity = q;
        this.itemID = id;
        this.itemDetails = details;
        this.VAT = vat;
    }

    // hämtar rätt antal och returnerar det.
    public int getQuantity()
    {
        return quantity;
    }
    // Gör Item till en läsbar string.
    public String toString()
    {
        String string = "";
        string += this.quantity;
        string += " "+ this.itemID;
        string += " " + this.itemPrice + "USD";
        return string;
    }
 
}
