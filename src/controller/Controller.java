package controller;

import data.SaleDTO;
import data.StoreDTO;
import integration.AccountSystem;
import integration.InventorySystem;
import integration.ReceiptPrinter;
import model.Receipt;
import model.Sale;



public class Controller 
{
    private Sale activeSale;
    private AccountSystem as;
    private InventorySystem is;
    private ReceiptPrinter rp;
    private StoreDTO store;

    public Controller()
    {
        store = new StoreDTO ("Ica Kvantum Kungsholmen", "Fleminggatan 16");
        is = new InventorySystem();
        as = new AccountSystem ();
        rp = new ReceiptPrinter();


    }
    public boolean newSale (int customerID)
    {
        activeSale = new Sale();
        return true;

    }
    
    public boolean addItem (int itemID)
    {
        return activeSale.addItem (itemID, is);

    }
    public boolean endSale (double paid, String sList, String pList)
    {
        SaleDTO dto = activeSale.endSale(sList, pList);
        Receipt r = new Receipt (dto);
        if(paid > dto.getTotal() + dto.getVAT() + " Change: /n");
        {
            rp.PrintReceipt(r);
            as.registerSale(dto);
            return true;
        }
        return false;
    }
    public void terminate ()
    {
        activeSale.terminateSale();
    }
    public boolean addItem (int itemID, int count)
    {
        return activeSale.addItems(itemID, count, is);
    }
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
