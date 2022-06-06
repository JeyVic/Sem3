package model;

import data.SaleDTO;
import integration.InventorySystem;
import java.util.*;
import java.util.ArrayList;


/** Sale tar hand om allt som handlar om att sälja.
 */
public class Sale {
    private boolean active;
    private List<Item> itemList = new ArrayList<Item>();
    private double totalPrice;
    private int saleID;
    private List<Observer> observerList = new ArrayList<Observer>();

    /** Constructor Sale, 
     */
    public Sale()
    {
        itemList.clear();
        active = true;
        totalPrice = 0;
        saleID = (50);
    }

    /** Metoden addItem adderar produkten till sale.
     *  kollar även om item redan är skannat.
     * @param barcode
     * @param is
     * @return
     */
    public boolean addItem (int barcode, InventorySystem is)
    {
        Item gotItem;
        if (is.inStock(barcode))
        {
            gotItem = is.getItem(barcode);
            gotItem = new Item (gotItem);
            int p = 0;
            boolean right = false;
            for (Item i : itemList)
            {
                if (i.itemID == gotItem.itemID)
                {
                    right = true;
                    p = itemList.indexOf(i);
                }
            }
            if (right)
            {
                int t = p;
                this.itemList.get(t).quantity++;

            }
            else{
                itemList.add(gotItem);
            }
            totalPrice += gotItem.itemPrice;
            return true;
        }
    return true;
    }
/** Adderar produkterna till sale.
 * 
 * @param itemID item id, alla items har ett id.
 * @param quantity antal av det valda item.
 * @param is
 * @return returnerar boolean
 */
    public boolean addItems(int itemID, int quantity,InventorySystem is)
    {
        boolean right = false;
        if (is.inStock(itemID, quantity))
        {
            for (int i = 0; i<quantity; i++)
            {
                right = this.addItem(itemID,is);
            }
        }
    return right;
    }
   /** har avslutat vi sale.
    * 
    * @param pos motager en string som heter pos.
    * @return ett totalpris inc vat, ett sale id, en lista på alla items.
    */
    public SaleDTO endSale(String pos)
    {
        double totalVAT = 0;
        for (Item i : itemList)
        {
            totalVAT += i.VAT*i.itemPrice*i.quantity;
        }
        SaleDTO theSale = new SaleDTO (totalPrice, totalVAT, itemList, pos, saleID);
        
        return theSale;
    }
    /** information om att vi har en aktiv sale.
     * 
     * @return
     */
    public boolean getProgress()
    {
        return active;
    }

    public void terminateSale ()
    {
        System.out.println ("Sale terminated!");
    }

    /** funktion som det gör det till en läsbar string.
     * 
     */
    public String toString()
    {
        StringBuilder string = new StringBuilder();
        for (Item i : itemList)
        {
            string.append(i);
        }
        return string.toString();
    }
    /** uppdaterar Observer.
     * 
     * @param amount
     */
    
    public void updateObserver (double amount)
    {
        for (Observer o : observerList)
        {
            o.updateRevenue(amount);
        }
    }
    /** adderar en lista med Observer
     * 
     * @param observer
     */
    public void addOberserver (Observer observer)
    {
        observerList.add(observer);
    }
}
