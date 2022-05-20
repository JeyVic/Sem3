package data;

import java.util.*;
import model.Item;

/** Här finns informationen om säljet. hämtar  varan, ID, pris och VAT
 * 
 */
public class SaleDTO 
{
    private double totalPrice;
    private int saleID;
    private double totalVAT;
    private List <Item> itemList = new ArrayList <Item>();
    private String cashier;
    private String pos;
    

    /** Constructor
     * 
     * @param totalPrice totalpris
     * @param totalVAT totalt VAT summa
     * @param itemList lista på alla varor
     * @param pos      
     * @param saleID
     */
    public SaleDTO(double price, double vat, List<Item> list, String pos, int id) 
    {
        this.totalPrice = price;
        this.itemList = list;
        this.saleID = id;
        this.totalVAT = vat;
        this.pos = pos;
    }

    /**
     * kopia av nya addresserna, då kan vi ändra i det gamla.
     * @return
     */
    public SaleDTO copy()
    {
        SaleDTO temp = new SaleDTO(this.totalPrice, this.totalVAT, this.itemList, this.pos, this.saleID);
        temp.cashier(this.cashier);

    }

    public void (String Cashier) 
    {
        this.cashier = cashier;
    }

    /**
     * hämtar rätt item
     * @return
     */
    public List<Item> getItem()
    {
        return itemList;
    }

    /**
     * hämtar rätt saleID
     * @return
     */
    public int getSaleID ()
    {
        return saleID;
    }

    /** 
     * hämtar rätt pris.
     */
    public double getTotal()
    {
        return totalPrice;
    }

    /**
     * hämtar VAT
     * @return
     */
    public double getVAT ()
    {
        return totalVAT;
    } 
}
