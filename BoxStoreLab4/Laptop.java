/**
 * Laptop.java
 * Ryan Vargas
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The Laptop class represents a laptop available in the store.
 * It extends ElectronicsItem and includes attributes specific to laptops,
 * such as operating system, RAM size, battery capacity, and processor type.
 */
public class Laptop extends ElectronicsItem {
    private String operatingSystem;
    private int ramSize;
    private int batteryCapacity;
    private String processor;

    /**
     * Constructs a Laptop object with specified attributes.
     *
     * @param name            The name of the laptop.
     * @param price           The price of the laptop.
     * @param quantity        The available stock quantity.
     * @param brand           The brand of the laptop.
     * @param description     The description of the laptop
     * @param screenType      The type of screen (e.g., LED, OLED, LCD).
     * @param touchScreen     Indicates if the laptop has a touchscreen.
     * @param bluetooth       Indicates if the laptop has Bluetooth.
     * @param processor       The processor type (e.g., Intel i7, Ryzen 9).
     * @param ramSize         The RAM size in GB (e.g., 8GB, 16GB).
     * @param batteryCapacity The battery capacity in watt-hours (Wh).
     * @param operatingSystem The operating system of the laptop (e.g., Windows, macOS, Linux).
     */
    public Laptop(String name, double price, int quantity, String brand, String description,
                  String screenType, Boolean touchScreen, Boolean bluetooth,
                  String processor, int ramSize, int batteryCapacity, String operatingSystem) {
        super(name, price, quantity, brand,description, screenType, touchScreen, bluetooth);
        this.ramSize = ramSize;
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
    }

    /**
     * Default constructor for Laptop.
     * Initializes an object with default values.
     */
    public Laptop() {
        super();
        this.ramSize = 0;
        this.batteryCapacity = 0;
        this.operatingSystem = "";
        this.processor = "";
    }

    // =================== Setters ===================

    /**
     * Sets the operating system of the laptop.
     *
     * @param operatingSystem The new operating system (e.g., Windows, macOS, Linux).
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * Sets the RAM size of the laptop.
     *
     * @param ramSize The new RAM size in GB.
     */
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    /**
     * Sets the battery capacity of the laptop.
     *
     * @param batteryCapacity The new battery capacity in watt-hours (Wh).
     */
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Sets the processor type of the laptop.
     *
     * @param processor The new processor model (e.g., Intel i7, Ryzen 9).
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    // =================== Getters ===================

    /**
     * Retrieves the operating system of the laptop.
     *
     * @return The operating system (e.g., Windows, macOS, Linux).
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Retrieves the RAM size of the laptop.
     *
     * @return The RAM size in GB.
     */
    public int getRamSize() {
        return ramSize;
    }

    /**
     * Retrieves the battery capacity of the laptop.
     *
     * @return The battery capacity in watt-hours (Wh).
     */
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Retrieves the processor type of the laptop.
     *
     * @return The processor model (e.g., Intel i7, Ryzen 9).
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Returns a string representation of the Laptop object, including product details
     * from ElectronicsItem and additional laptop-specific attributes.
     *
     * @return A formatted string containing laptop details.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nOperating System: " + operatingSystem +
                " | RAM Size: " + ramSize + "GB" +
                " | Battery Capacity: " + batteryCapacity + "Wh" +
                " | Processor: " + processor;
    }

    /**
     * Creates a copy of this Laptop item with a new quantity
     *
     * @param quantity The quantity to assign to the cloned item.
     * @return a new Laptop object with the same data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new Laptop(getName(), getPrice(), quantity, getBrand(), getDescription(),
                getScreenType(), getTouchScreen(), getBluetooth(),
                getProcessor(), getRamSize(), getBatteryCapacity(),
                getOperatingSystem());
    }

}
