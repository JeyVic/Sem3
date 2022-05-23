package controller;

import data.SaleDTO;
import data.StoreDTO;
import integration.AccountSystem;
import integration.InventorySystem;
import integration.ReceiptPrinter;
import model.Receipt;
import model.Sale;

/** Alla calls kommer passare den här klassen.
 * 
 */

public class Controller 
{
    private Sale activeSale;
    private AccountSystem as;
    private InventorySystem is;
    private ReceiptPrinter rp;
    private StoreDTO store;

    /** Constructor
     * 
     * */ 
    public Controller()
    {
        store = new StoreDTO ("Ica Kvantum Kungsholmen", "Fleminggatan 16");
        is = new InventorySystem();
        as = new AccountSystem ();
        rp = new ReceiptPrinter();


    }

    /** Startar nytt Sale,
     * 
     * @param customerID används för discount om kunden är berättigad.
     * @return
     */
    public boolean newSale (int customerID)
    {
        activeSale = new Sale();
        return true;

    }
    /** Adderar ett item till aktivtSale.
     * 
     * @param itemID adderar varans ID.
     * @return
     */
    public boolean addItem (int itemID)
    {
        return activeSale.addItem (itemID, is);

    }

    /** 
     *  Stänger Sale.
     * @param paid double, vad för värde som betalas.
     * @param sList string
     * @param pList string, positionen på säljet
     * @return
     */
    public boolean endSale (double paid, String sList, String pList)
    {
        SaleDTO saleDto = activeSale.endSale(pList);
        StoreDTO storeDto = this.store;
        Receipt r = new Receipt (saleDto, storeDto);
        if(paid > saleDto.getTotal() + saleDto.getVAT())
        {
            rp.PrintReceipt(r);
            as.registerSale(saleDto);
            return true;
        }
        else return false;
    }

    /**
     * Terminerar sälj,
     */
    public void terminate ()
    {
        activeSale.terminateSale();
    } 
    /**
     * 
     * @param itemID ID för varan.
     * @param count antal av samma vara.
     * @return 
     */
    public boolean addItem (int itemID, int count)
    {
        return activeSale.addItems(itemID, count, is);
    }

    /**
     * Gör en läsbar string.
     */
    public String getString()
    {
        if (activeSale.getProgress())
        {
            String string;
            string = activeSale.toString();
            return string;
        }
    return null;
    }
}
