package integration;

import data.SaleDTO;
import model.Receipt;
import java.util.ArrayList;
import java.util.List;

public class AccountSystem 
{
    List<SaleDTO> saleList;

    // constructorn.
    public AccountSystem() 
    {
        saleList = new ArrayList<>();
        for (int i = 0; i<100; i++)
        {
            saleList.add(null);
        }
    }
    /** registrerar ett nytt sale som ska registreras i Accountsytem.
     * 
     * @param dto
     * @return
     */
    public boolean registerSale (SaleDTO dto)
    {
        if (saleList.get(dto.getSaleID()) !=null)
        {
            saleList.set(dto.getSaleID(),dto);
            return true;
        }
        return false;

    }

    // hämtar saleDTO
    public SaleDTO getSaleDTO (int saleID)
    {
        SaleDTO temp = saleList.get(saleID);
        return temp;

    } 

    // tar mot lista för sedan returnera r till findSaldto.
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