package data;

/** klasen itemDTo har alla information om det varor som säljs.
 * items har olika attributer.
 */

public class ItemDTO 
{
    private int itemID;
    private double itemPrice;
    private double VAT;
    private String description;
    
    /** Constructor 
     * 
     * @param itemID varans ID.
     * @param price varans pris
     * @param VAT varans VAT, en procent
     * @param itemDescription detaljer om varan
     */ 
    public ItemDTO (int itemID, double price, double VAT, String itemDescription) 
    {
        this.itemID = itemID;
        this.itemPrice = price;
        this.VAT = VAT;
        this.description = itemDescription;
    }
    
    /**
     * används av objekt med type ItemDTO
     * @return rätt ID till varan.
     */
    public int getItemId()
    {
        return itemID;
    }

    /**
     * hämtar rätt pris.
     * @return priset på den varan.
     */
    public double getPrice()
    {
        return itemPrice;
    }

    /**
     * hämtar rätt VAT procent.
     * @return varans VAT
     */
    public double getVat()
    {
        return VAT;
    }

    /**
     * hämtar information kring varan.
     * @return information kring varan
     */
    public String getDescription () {
        return description;
    }
}
