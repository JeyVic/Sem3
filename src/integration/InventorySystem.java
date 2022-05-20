package integration;

import model.Item;
import java.util.*;

/** skapar en samlingsplats för alla items.
 * 
 */

public class InventorySystem 
{
    private List<Item> cInventory = new ArrayList<>();
   
    // Constructorn
    public InventorySystem ()
    {

    } 
    /** kollar current inventory.
     * 
     * @param id 
     * @return
     */
    public Item getItem (int id)
    {
        return cInventory.get(id);

    }
    
    // Gör det till en läsbar string.
    public String toString ()
    {
        String string = "";
        for (Item item : cInventory)
        {
            string += "/n" + item.toString();
        }
        return string;
    }

    // kollar om det finns produkt med hjälp av produkt id.
    public boolean inStock (int id)
    {
        if (cInventory.size() >= id) 
        {
            Item ie = cInventory.get(id);
            if (ie.getQuantity() < 0)
            return true;
        }
        return false;

    }

    // kollar om det är flera produkter som finns, med hjälp av id och kvantitet.
    public boolean inStock (int id, int quantity)
    {
        if (cInventory.size() >= id) 
        {
            Item ie = cInventory.get(id);
            if (ie.getQuantity() >= quantity)
            return true;
        }
        return false;
    }

    // item id läggs till i currentInventory.
    public void addItem (Item id)
    {
        cInventory.add(id);
    }
}
