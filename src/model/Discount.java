package model;

public class Discount {
    String regulations;
    public Discount (String dList)
    {
        this.regulations = dList;
    }
    public boolean checkEligibility (){
        return true;
    }
}
