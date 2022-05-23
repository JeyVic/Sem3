package controller;


class ControllerTest 
{
    Controller contr;
    @BeforeEach
    void setUp()
    {
        contr = new Controller();
        contr.newSale(1);
    }

    @AfterEach
    void tearDown()
    {
            
    }

    @Test
    void endSale()
    {
        boolean r = false;
        contr.endSale(27, "string", "test!");     // endSale tar mot String.
        if (contr.getString() == null)
        {
            r = true;
        }
        assert r == true; 
    }

}
