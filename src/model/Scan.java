package model;

import integration.InventorySystem;

public class Scan {
    static InventorySystem is;
    public static Item getItemFromBarcode (int barcode)
    {
        Item item = is.getItem(barcode);
        return item;
    }
    
}
