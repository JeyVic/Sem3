import controller.Controller;
import view.View;

/** Startar hela programmet
*/
public class Sem3 
{
    public static void main(String[] args) 
    {
        // hardCoded class till view. 
        Controller contr = new Controller();
        View view = new View(contr);
        view.hardCodedControllerCalls();
    }
}