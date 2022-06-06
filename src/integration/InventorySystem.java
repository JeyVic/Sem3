package integration;

import model.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.lang.Exception;

/** skapar en samlingsplats för alla items.
 * 
 */

public class InventorySystem 
{
    private static InventorySystem instance = null;
    private List<Item> cInventory = new ArrayList<>();
   
    /** Constructor.
     * 
     */
    public InventorySystem ()
    {
        try
        {
            Scanner scan = new Scanner (new File ("src/integration/info.txt").getAbsolutePath());
            String[] temp;
            Item item;
            int line = 0;

            item = new Item(2, 50, 25, "Proteinbar", 1);
            cInventory.add(item);
            item = new Item(1, 20, 12, "Proteinshake", 2);
            cInventory.add(item);
            item = new Item(3, 50, 25, "Candybar", 3);
            cInventory.add(item);
            item = new Item(1, 15, 12, "Energydrink", 4);
            cInventory.add(item);
            item = new Item(1, 20, 12, "Proteinshake", 2);
            cInventory.add(item);
        }
        catch (SecurityException e)
        {
            System.out.println("No File Found!");
            e.printStackTrace();
        }    

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
    
    /** gör det till en läsbar string.
     * 
     */
    public String toString ()
    {
        String string = "";
        for (Item item : cInventory)
        {
            string += "/n" + item.toString();
        }
        return string;
    }

    /** kollar om det finns produkt med hjälp av endast ID.
     * 
     * @param id
     * @return
     */
    public boolean inStock (int id)
    {
        if (cInventory.size() >= id) 
        {
            Item ie = cInventory.get(id);
            if (ie.getQuantity() > 0)
            return true;
        }
        return false;

    }

    /** kollar om det är flera produkter som finns, med hjälp av id och kvantitet.
     * 
     * @param id
     * @param quantity
     * @return
     */
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

    /** lägger till item id i cInvetory (currentInventory)
     * 
     * @param id
     */
    public void addItem (Item id)
    {
        cInventory.add(id);
    }
    /** skapar en samlingsplats för alla varor.
     * 
     * @return
     */
    public static InventorySystem getInstance() 
    {
        if (instance == null)
        {
            instance = new InventorySystem();
        }
        else System.out.println("The existing inventorysystem instance!");
        return instance;
    }
}
