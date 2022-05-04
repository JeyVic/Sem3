package data;

import java.util.*;
import model.Item;

public class SaleDTO 
{
    private double totalPrice;
    private int saleID;
    private double totalVAT;
    private List <Item> itemList = new ArrayList <Item>();
    
    public SaleDTO(double totalPrice2, double totalVAT2, List<Item> itemList2, String pos, int saleID2) {
    }
    public void saleDTO (double price, double vat, List<Item>list, String pos, int id)
    {
        this.totalPrice = price;
        this.itemList = list;
        this.saleID = id;
        this.totalVAT = vat;

    }
    public List<Item> getItem()
    {
        return itemList;
    }
    public int getSaleID ()
    {
        return saleID;
    }
    public double getTotal()
    {
        return totalPrice;
    }
    public double getVAT ()
    {
        return totalVAT;
    } 
}
