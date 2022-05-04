package data;

public class StoreDTO {

    private String storeName;
    private String storeLocation;
 
    public StoreDTO (String name, String location)
    {
        storeName = name;   
        storeLocation = location;
    }
    public String getStoreName()
    {
        return storeName;
    }
    public String getLocation()
    {
        return storeLocation;
    }
}
