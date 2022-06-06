package integration;


import main.se.kth.salessystem.model.Sale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestAccountSystem 
{
    private Controller contr;
    private AccountSystem as;
    private SaleDTO dto;

    @BeforeEach
    void setUp() 
    {
        contr = new Controller();
        as = new AccountSystem();
        Sale temp = new Sale();
        contr.addItem(2, 1);
        dto = temp.endSale("test", "funkar");
    }

    @Test
    void testRegisterSale() { 
        boolean r = false;
        as.registerSale(dto);
        if (as.getSaleDTO(dto.getSaleID()) != null) 
        {
            r = true;
        }
        assertTrue(r, "ERROR! Registering sale failed. ");
    }

    private void assertTrue(boolean r, String string) {
    }

    @Test
    void testGetSaleDTO() 
    {
        boolean e = true;
        as.registerSale(dto);
        boolean e = dto.equal(as.getSaleDTO(dto.getSaleID()));
        assertEquals(e, r, "getSaleDTO failed");
    }
}

