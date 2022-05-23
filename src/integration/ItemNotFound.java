package integration;

public class ItemNotFound extends Exception 
{
    private int itemID;

    public ItemNotFound (int id, String wrongID)
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