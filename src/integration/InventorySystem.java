package integration;

import model.Item;
import java.util.*;


public class InventorySystem 
{
    private List<Item> cInventory = new ArrayList<>();
    public InventorySystem ()
    {

    } 
    public Item getItem (int id)
    {
        return cInventory.get(id);

    }   
    public String toString ()
    {
        String string = "";
        for (Item item : cInventory)
        {
            string += "/n" + item.toString();
        }
        return string;
    }
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
    public void addItem (Item id)
    {
        cInventory.add(id);
    }
}
