package integration;

import controller.Test;
@Test
public class ItemNotFoundException extends Exception 
{
    private int itemID;

    public ItemNotFoundException (int id, String wrongID)
    {
        super(wrongID);
        this.itemID = id;
    }
    public int barcodeFail ()
    {
        return this.itemID;
    }
    public String getMessage()
    {
        StringBuilder strB = new StringBuilder ();
        strB.append("Item not found - exception"+ java.time.LocalDate.now() + java.time.LocalTime.now() + "/n");
        return strB.toString();
    }
}