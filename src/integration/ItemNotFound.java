package integration;

public class ItemNotFound extends Exception 
{
    private int itemID;

    public ItemNotFound (int id, String wrongID)
    {
        super(wrongID);
        this.ID = id;
    }
    public int barcodeFail ()
    {
        return this.ID;
    }
    public String getMessage()
    {
        StringBuilder strB = new StringBuilder ();
        strB.append("Item not found - exception"+ java.time.LocalDate.now() + java.timeLocalTime.now() + "/n");
        return strB.toString();
    }
}