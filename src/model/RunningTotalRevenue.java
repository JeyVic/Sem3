package model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RunningTotalRevenue 
{
    String fileLoc = "";
    double amount;

    public RunningTotalRevenue()
    {
        amount = 0;
        fileLoc = "src/model/totalRevenue.txt";
    }
    
 
    public void updateRevenue (double amount)
    {
        this.amount += amount;
        try 
        {
            PrintWriter logger = new PrintWriter(fileLoc);
            logger.println(totalToString());
            logger.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("No space left!");
            e.printStackTrace();
        }
    }
    
    public String totalToString()
    {
        return "Obeserver:" + amount + "SEK";
    }
}