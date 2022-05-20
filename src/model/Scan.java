package model;

import integration.InventorySystem;

/** metoden Scan scannar en barcode och returnerar det som vilken vara det är.
 * 
 */
public class Scan {
    static InventorySystem is;
    public static Item getItemFromBarcode (int barcode)
    {
        Item item = is.getItem(barcode);
        return item;
    }
    
}
