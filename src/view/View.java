package view;

import controller.Controller;

/** I view kommer vi printa ut och använda oss av hardcodedcontrollcalls.
 * 
 */
public class View 
{
    private Controller contr;
    public View (Controller cont)
    {
        contr = cont; 
    }
    public void hardCodedControllerCalls()
    {
        System.out.println("New Sale!");
        System.out.println("-------------------");
        contr.newSale(12);
        System.out.println("Add one proteinbar");
        contr.addItem(1);
        System.out.println("Add two proteinshake");
        contr.addItem(2, 2);
        System.out.println("Add one candybar");
        contr.addItem(3);
        System.out.println("Add one energydrink");
        contr.addItem(4);
        System.out.println("Add one more proteinshake");      // 3-4b
        contr.addItem(1);
        contr.endSale(100, "1", "5");
        System.out.println("End Sale!");
        System.out.println("-------------------");
        contr.terminate();
   }
}