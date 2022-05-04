package data;

public class ItemDTO 
{
    private int itemID;
    private double itemPrice;
    private double VAT;
    private String description;
    
    public ItemDTO (int itemID, double price, double VAT, String itemDescription) 
    {
        this.itemID = itemID;
        this.itemPrice = price;
        this.VAT = VAT;
        this.description = itemDescription;
    }
    public int getItemId()
    {
        return itemID;
    }
    public double getPrice()
    {
        return itemPrice;
    }
    public double getVat()
    {
        return VAT;
    }
    public String getDescription () {
        return description;
    }
}
