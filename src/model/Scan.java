package model;

import integration.InventorySystem;
import integration.ItemNotFoundException;

/** Metoden Scan scannar en barcode och returnerar det som vilken vara det är.
 * Kommer även kasta exception ifall barcode inte finns (varan inte existerar!)
 */
public class Scan 
{
    static InventorySystem is;
    public static Item getItemFromBarcode (int barcode) throws ItemNotFoundException
    {
        Item item = is.getItem(barcode);
        if (item == null)
        {
            throw new ItemNotFoundException (barcode, "Item can't be found!");
        }
        return item;
    }
    public Item scan(int itemIdentifier) throws ItemNotFoundException {
        throw new ItemNotFoundException (2, "Item can't be found!");
    }
    
}
