package integration;

import data.SaleDTO;
import model.Receipt;
import java.util.ArrayList;
import java.util.List;

public class AccountSystem 
{
    List<SaleDTO> saleList;

    public AccountSystem() 
    {
        saleList = new ArrayList<>();
        for (int i = 0; i<100; i++)
        {
            saleList.add(null);
        }
    }
    public boolean registerSale (SaleDTO dto)
    {
        if (saleList.get(dto.getSaleID()) !=null)
        {
            saleList.set(dto.getSaleID(),dto);
            return true;
        }
        return false;

    }
    public SaleDTO getSaleDTO (int saleID)
    {
        SaleDTO temp = saleList.get(saleID);
        return temp;

    } 
    public SaleDTO findSaleDTO (Receipt rList)
    {
        int temp = rList.getSaleID();
        for (SaleDTO r : saleList)
        {
            if (r.getSaleID() == temp)
            {
                return r;
            }
        }
        return null;
    }
}