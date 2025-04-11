/**
 * TV.java
 * @author Jovani Rivera-Hernandez
 * Date: March 16, 2025
 * Section: 331 002
 *
 * The TV class represents TV products available in a store.
 * It extends the Store class and includes attributes specific to TV's,
 * such as model, resolution, size, is smart tv.
 */

public class TV extends StoreItem{

    /**
     * private attributes representing tv details
     */
    private String model;
    private String resolution;
    private int size;
    private boolean smartTV;

    /**
     * constructor to initialize tv with given parameters
     * @param name          The name of the TV
     * @param price         The price of the TV
     * @param quantity      The quantity of the TV
     * @param brand         The brand of the TV
     * @param description   The description of the TV
     * @param model         The model of the TV
     * @param resolution    The resolution of the TV
     * @param size          The size of the TV
     * @param smartTV       If the TV is smart or not (True or False)
     */
    public TV (String name, double price, int quantity, String brand, String description, String model, String resolution, int size, boolean smartTV){
        super(name, price, quantity, brand,description);
        this.model = model;
        this.resolution = resolution;
        this.size = size;
        this.smartTV = smartTV;
    }

    /**
     * retrives model, resolution, size, is smart tv
     * @return model
     * @return resolution
     * @return size
     * @return smart tv
     */
    public String getModel() {return model;}
    public String getResolution() {return resolution;}
    public int getSize() {return size;}
    public boolean isSmartTV() {return smartTV;}

    /**
     * updates the model of the tv
     * @param model
     */
    public void setModel(String model) {this.model = model;}

    /**
     * updates the resolution of the tv
     * @param resolution
     */
    public void setResolution(String resolution) {this.resolution = resolution;}

    /**
     * updates the size of the tv
     * @param size
     */
    public void setSize(int size) {this.size = size;}

    /**
     * updates if tv is a smart tv or not
     * @param smartTV
     */
    public void setSmartTV(boolean smartTV) {this.smartTV = smartTV;}

    /**
     * Returns a string representation of the ElectronicsItem object, including
     * product details from the parent class and additional tv specified attributes
     * @return a formatted string containing product details
     */
    @Override
    public String toString() {
        return super.toString() + ".\nTv model is: " + getModel() +
                " | Tv resolution is: " + getResolution() +
                " | Tv size is: " + getSize() + " | Is Tv a smart tv: " + isSmartTV();
    }
    /**
     * Creates a copy of this TV item with a new quantity
     *
     * @param quantity The quantity for the cloned item.
     * @return A new TV object with the same data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new TV(getName(), getPrice(), quantity, getBrand(),getDescription(),
                getModel(), getResolution(), getSize(), isSmartTV());
    }


}
