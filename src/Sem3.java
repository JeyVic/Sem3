import controller.Controller;
import view.View;

public class Sem3 
{
    public static void main(String[] args) 
    {
        Controller contr = new Controller();
        View view = new View(contr);
        view.hardCodedControllerCalls();
    }
}