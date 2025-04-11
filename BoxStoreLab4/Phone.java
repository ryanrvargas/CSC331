/**
 * Phone.java
 * @author Ryan Vargas
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The Phone class represents a mobile phone available in the store.
 * It extends ElectronicsItem and includes additional attributes
 * such as color, carrier, model, and storage capacity.
 */
public class Phone extends ElectronicsItem {
    private String color;
    private String carrier;
    private String model;
    private int storage;

    /**
     * Constructs a Phone object with specified attributes.
     *
     * @param name       The name of the phone.
     * @param price      The price of the phone.
     * @param quantity   The available stock quantity.
     * @param brand      The brand of the phone.
     * @param description The description of the phone
     * @param screenType The type of screen (e.g., OLED, LCD).
     * @param touchScreen Indicates if the phone has a touchscreen.
     * @param bluetooth  Indicates if the phone supports Bluetooth.
     * @param color      The color of the phone.
     * @param carrier    The carrier compatibility (e.g., Verizon, AT&T, T-Mobile).
     * @param model      The model name of the phone.
     * @param storage    The storage capacity of the phone in GB.
     */
    public Phone(String name, double price, int quantity, String brand, String description, String screenType, Boolean touchScreen,
                 Boolean bluetooth, String color, String carrier, String model, int storage) {
        super(name, price, quantity, brand, description, screenType, touchScreen, bluetooth);
        this.color = color;
        this.carrier = carrier;
        this.model = model;
        this.storage = storage;
    }

    /**
     * Default constructor for Phone.
     * Initializes an object with default values.
     */
    public Phone() {
        super();
        this.color = null;
        this.carrier = null;
        this.model = null;
        this.storage = 0;
    }

    // =================== Setters ===================

    /**
     * Sets the color of the phone.
     *
     * @param color The new color of the phone.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Sets the carrier compatibility of the phone.
     *
     * @param carrier The new carrier (e.g., Verizon, AT&T, T-Mobile).
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * Sets the model of the phone.
     *
     * @param model The new model name of the phone.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Sets the storage capacity of the phone.
     *
     * @param storage The new storage capacity in GB.
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    // =================== Getters ===================

    /**
     * Retrieves the color of the phone.
     *
     * @return The phone's color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Retrieves the carrier compatibility of the phone.
     *
     * @return The carrier (e.g., Verizon, AT&T, T-Mobile).
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Retrieves the model of the phone.
     *
     * @return The model name of the phone.
     */
    public String getModel() {
        return model;
    }

    /**
     * Retrieves the storage capacity of the phone.
     *
     * @return The storage capacity in GB.
     */
    public int getStorage() {
        return storage;
    }

    /**
     * Returns a string representation of the Phone object, including product details
     * from the parent classes and additional phone-specific attributes.
     *
     * @return A formatted string containing phone details.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nColor: " + color +
                " | Carrier: " + carrier +
                " | Model: " + model +
                " | Storage: " + storage + "GB";
    }
    /**
     * Creates a copy of this Phone item with a new quantity
     *
     * @param quantity The quantity for the cloned item.
     * @return A new Phone object with the same data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new Phone(getName(), getPrice(), quantity, getBrand(),getDescription(),
                getScreenType(), getTouchScreen(), getBluetooth(),
                getColor(), getCarrier(), getModel(), getStorage());
    }

}
