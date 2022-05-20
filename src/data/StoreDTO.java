package data;

public class StoreDTO {

    private String storeName;
    private String storeLocation;
 

    /**
     * Constructorn
     * @param name vilken butik, typ ICA Kvantum kungsholmen
     * @param location vart ligger butiken, address.
     */
    public StoreDTO (String name, String location)
    {
        storeName = name;   
        storeLocation = location;
    }

    /**
     * hämtar namnet på butiken
     * @return
     */
    public String getStoreName()
    {
        return storeName;
    }

    /**
     * hämtar vart butiken ligger.
     * @return
     */
    public String getLocation()
    {
        return storeLocation;
    }
}
