package model;

import data.SaleDTO;
import integration.InventorySystem;
import java.util.*;

public class Sale {
    private boolean active;
    private List<Item> itemList = new ArrayList<Item>();
    private double totalPrice;
    private int saleID;

    public Sale()
    {
        itemList.clear();
        active = true;
        totalPrice = 0;
        saleID = (50);
    }

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
    public boolean getProgress()
    {
        return active;
    }
    public String toString()
    {
        StringBuilder string = new StringBuilder();
        for (Item i : itemList)
        {
            string.append(i);
        }
        return string.toString();
    }
}
