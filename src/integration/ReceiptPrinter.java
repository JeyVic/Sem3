package integration;

/** Här printas kvittot ut.
 * 
 */
import model.Receipt;

public class ReceiptPrinter {
    public boolean PrintReceipt (Receipt receipt){
        System.out.println(receipt);
        return true;
    }
    
}
