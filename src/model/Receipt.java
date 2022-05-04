package model;

import java.util.*;
import data.SaleDTO;
import data.StoreDTO;

public class Receipt 
{    
    private final double totalPrice;
    private final double totalVAT;
    private final List<Item> itemList;
    private final int saleID;
    private final String storeLocation;

    public Receipt (SaleDTO dto, StoreDTO store)
    {
        this.storeLocation = store.getStoreName() + " /n" + store.getLocation()+ "/n";
        this.itemList = dto.getItem();
        this.totalPrice = dto.getTotal();
        this.saleID = dto.getSaleID();
        double vat = 0;
        for (Item item : itemList)
        {
            vat += item.itemPrice*item.quantity*item.VAT;
        }
        this.totalVAT = vat;
    }

    public int getSaleID()
    {
        return this.saleID;
    }
    public String toString()
    {
        StringBuilder string = new StringBuilder();
        string.append(storeLocation);
        for (Item item : itemList)
        {
            string.append(item.quantity + " " + item.itemID + " " + item.itemPrice + " /n" );
        }
        string.append ("Totalprice: "+ this.totalPrice + " /n");
        string.append ("VAT: "+ this.totalVAT + " /n");
        string.append ("Totalprice inc VAT: "+ (this.totalPrice+this.totalVAT) + " /n");

        return string.toString();
    }

}   

