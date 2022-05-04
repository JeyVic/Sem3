package controller;

import java.beans.Transient;

class ControllerTest 
{
    Controller contr;
    @BeforeEach
    void setUp()
    {
        contr = new Controller();
        contr.startNewSale(1);
    }

    @AfterEach
    void tearDown()
    {
            
    }

    @Test
    void endSale()
    {
        boolean r = false;
        contr.endSale("test!");     // endSale tar mot String.
        if (contr.getString() == null)
        {
            r = true;
        }
        assertTrue(r, "ControllerTest failed with endSale");
    }
}
