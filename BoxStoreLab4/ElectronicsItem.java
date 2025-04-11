/**
 * ElectronicsItem.java
 * @author Ryan Vargas
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The ElectronicsItem class represents electronic products available in a store.
 * It extends the Store class and includes attributes specific to electronics,
 * such as touchscreen capability, screen type, and Bluetooth functionality.
 */
public class ElectronicsItem extends StoreItem {
    private Boolean touchScreen;
    private String screenType;
    private Boolean bluetooth;

    /**
     * Constructs an ElectronicsItem object with specified attributes.
     *
     * @param name       The name of the electronic item.
     * @param price      The price of the electronic item.
     * @param quantity   The available stock quantity.
     * @param brand      The brand of the electronic item.
     * @param description The description of the electronic item
     * @param screenType The type of screen (e.g., LED, OLED, LCD).
     * @param touchScreen Indicates if the item has a touchscreen.
     * @param bluetooth  Indicates if the item supports Bluetooth.
     */
    public ElectronicsItem(String name, double price, int quantity, String brand, String description,
                           String screenType, Boolean touchScreen, Boolean bluetooth) {
        super(name, price, quantity, brand,description);
        this.touchScreen = touchScreen;
        this.screenType = screenType;
        this.bluetooth = bluetooth;
    }

    /**
     * Default constructor for ElectronicsItem.
     * Initializes an object without setting any attributes.
     */
    public ElectronicsItem() {
        super();
        this.touchScreen = false;
        this.screenType = "";
        this.bluetooth = false;
    }

    /**
     * Sets whether the item has a touchscreen.
     *
     * @param touchScreen true if the item has a touchscreen, false otherwise.
     */
    public void setTouchScreen(Boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    /**
     * Sets the type of screen the item has.
     *
     * @param screenType The screen type (e.g., LED, OLED, LCD).
     */
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    /**
     * Sets whether the item supports Bluetooth.
     *
     * @param bluetooth true if the item has Bluetooth, false otherwise.
     */
    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    /**
     * Retrieves whether the item has a touchscreen.
     *
     * @return true if the item has a touchscreen, false otherwise.
     */
    public Boolean getTouchScreen() {
        return touchScreen;
    }

    /**
     * Retrieves the screen type of the item.
     *
     * @return The screen type (e.g., LED, OLED, LCD).
     */
    public String getScreenType() {
        return screenType;
    }

    /**
     * Retrieves whether the item supports Bluetooth.
     *
     * @return true if the item has Bluetooth, false otherwise.
     */
    public Boolean getBluetooth() {
        return bluetooth;
    }

    /**
     * Returns a string representation of the ElectronicsItem object, including
     * product details from the parent class and additional electronic-specific attributes.
     *
     * @return A formatted string containing product details.
     */
    @Override
    public String toString() {
        return super.toString() + ".\nIs Touch Screen: " + getTouchScreen() +
                " | Screen Type: " + getScreenType() +
                " | Is Bluetooth: " + getBluetooth();
    }
}
