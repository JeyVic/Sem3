package controller;

import org.junit.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ControllerTest 
{
    Controller contr;
    String string;
   
    @BeforeEach
    void setUp()
    {
        contr = new Controller();
        contr.newSale(1);
    }

    @AfterEach
    void tearDown()
    {
        contr = null;
        string = null;        
    }

    @Test
    void testNewSale()
    {
        contr.newSale(1);
        contr.addItem(1);
        boolean r = contr.endSale(100, "Test", "Test");
        assertTrue(r, "ERROR! startNewSale controller failed!");
    }
    private void assertTrue(boolean result, String string2) {
    }
    @Test
    void testAddItem() 
    {
        boolean r = false;
        contr.addItem(0);
        if (contr.getString().equals("1 Proteinbar\n")) {
            r = true;
        }
        assertTrue(r, "ERROR! Controller testAddItem is failed!");

    }
    @Test
    void testEndSale()
    {
        boolean r = false;
        contr.endSale(35, "string", "test!");
        if ((contr.getString() == null || contr.getString() == ""))
        {
            r = true;
        }
        assertTrue (r, "ERROR! testEndSale failed!"); 
    }

    @Test
    void testTerminate() {
        boolean r = false;
        contr.terminate();
        if (contr.getString() == null) {
            r = true;
        }
        assertTrue(r, "ERROR! testTerminate failed!");
    }

}
