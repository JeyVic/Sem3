package model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;


/** klassen där vi skapar en ny fil.
 * 
 */
public class RunningTotalRevenue 
{
    String fileLoc = "";
    double amount;

    /** Constructorn till klassen.
    * 
    */
    public RunningTotalRevenue()
    {
        amount = 0;
        fileLoc = "totalRevenue.txt";
    }
    /** uppdaterar det som skrivs in i filen som skapas ovan.
     * 
     * @param amount
     */
 
    public void updateRevenue (double amount)
    {
        this.amount += amount;
        try 
        {
            PrintWriter logger = new PrintWriter(new FileWriter(fileLoc), true);
            logger.println(totalToString());
            logger.close();
        }
        catch (IOException e)
        {
            System.out.println ("No space left!");
            e.printStackTrace();
        }
    }
    /** returnerar två strings och en int i form av amount.
     * 
     * @return
     */
    public String totalToString()
    {
        return "Obeserver:" + amount + "SEK";
    }
}