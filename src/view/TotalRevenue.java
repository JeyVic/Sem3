package view;


import model.Observer;

/**
 * Sends information about the stores revenue.
 */
public class TotalRevenue implements Observer
{
    private double totalPaid;
/**
 * what the total revenue is
 */
    public TotalRevenue(){
        totalPaid = 0;
    }
    /**
     *  update after a new purchase.
     * @param amount the amount added for a purchase.
     */
    @Override
    public void updateRevenue(double amount)
    {
        totalPaid += amount;
        System.out.println(totalAmountString());

    }
    public String totalAmountString() 
    {
        return "Observer: " + totalPaid + "SEK.";
    }
}
