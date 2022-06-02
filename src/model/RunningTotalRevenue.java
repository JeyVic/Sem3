package model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RunningTotalRevenue 
{
    String fileLoc = "";
    double amount;

    public RunningTotalRevenue()
    {
        amount = 0;
        fileLoc = "totalRevenue.txt";
    }
    
 
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
    
    public String totalToString()
    {
        return "Obeserver:" + amount + "SEK";
    }
}