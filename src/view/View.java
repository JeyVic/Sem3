package view;

import controller.Controller;

/** klasen view kommer vara klassen som kör programmet genom hardcodedcontroll.
 */
public class View 
{
    Controller contr;
    public View (Controller cont)
    {
        contr = cont; 
    }
    public void hardCodedControllerCalls()
    {
        System.out.println("New Sale!");
        contr.newSale(42);
        System.out.println("Add one proteinbar");
        contr.addItem(0);
        System.out.println("Add two proteinshake");
        contr.addItem(1, 2);
        System.out.println("Add one candybar");
        contr.addItem(2);
        System.out.println("Add one energydrink");
        contr.addItem(3);
        System.out.println("Add one more proteinshake");      // 3-4b
        contr.addItem(1);
        contr.endSale(100, "1", "5");
        System.out.println("End Sale!");
        contr.terminate();
   }
}