/**
 * CleaningSupply.java
 * @author Ryan Vargas
 * Date: March 14, 2025
 * Section: 331 002
 *
 * The CleaningSupply class represents cleaning products available in the store.
 * It extends HouseholdItem and includes attributes specific to cleaning supplies,
 * such as whether it is a spray, cleaning type, scent, volume, and flammability.
 */
public class CleaningSupply extends HouseholdItem {
    private boolean spray;
    private String cleaningType;
    private String scent;
    private double volume;
    private boolean flammable;

    /**
     * Constructs a CleaningSupply object with specified attributes.
     *
     * @param name          The name of the cleaning supply.
     * @param price         The price of the product.
     * @param quantity      The available stock quantity.
     * @param brand         The brand of the product.
     * @param description   The description of the product
     * @param roomType      The room where the product is typically used.
     * @param dimensions    The dimensions of the product packaging.
     * @param material      The packaging material (e.g., "Plastic Bottle").
     * @param weight        The weight of the product in pounds or kilograms.
     * @param fragile       Indicates if the product is fragile.
     * @param spray         Indicates if the cleaning product is a spray.
     * @param cleaningType  The type of cleaning product (e.g., "Disinfectant", "Glass Cleaner").
     * @param scent         The scent of the product (e.g., "Lemon", "Lavender").
     * @param volume        The volume of the product in ounces or liters.
     * @param flammable     Indicates if the product is flammable.
     */
    public CleaningSupply(String name, double price, int quantity, String brand, String description,
                          String roomType, String dimensions, String material, int weight,
                          boolean fragile, boolean spray, String cleaningType, String scent,
                          double volume, boolean flammable) {
        super(name, price, quantity, brand, description, roomType , dimensions, material, weight, fragile);
        this.spray = spray;
        this.cleaningType = cleaningType;
        this.scent = scent;
        this.volume = volume;
        this.flammable = flammable;
    }

    /**
     * Default constructor for CleaningSupply.
     * Initializes an object with default values.
     */
    public CleaningSupply() {
        super();
        this.spray = false;
        this.cleaningType = "";
        this.scent = "";
        this.volume = 0.0;
        this.flammable = false;
    }

    // =================== Setters ===================

    /**
     * Sets whether the cleaning product is a spray.
     *
     * @param spray true if it is a spray, false otherwise.
     */
    public void setSpray(boolean spray) {
        this.spray = spray;
    }

    /**
     * Sets the cleaning type of the product.
     *
     * @param cleaningType The cleaning type (e.g., "Disinfectant", "Detergent").
     */
    public void setCleaningType(String cleaningType) {
        this.cleaningType = cleaningType;
    }

    /**
     * Sets the scent of the cleaning product.
     *
     * @param scent The scent of the product (e.g., "Lemon", "Lavender").
     */
    public void setScent(String scent) {
        this.scent = scent;
    }

    /**
     * Sets the volume of the cleaning product.
     *
     * @param volume The volume in ounces or liters.
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Sets whether the product is flammable.
     *
     * @param flammable true if the product is flammable, false otherwise.
     */
    public void setFlammable(boolean flammable) {
        this.flammable = flammable;
    }

    // =================== Getters ===================

    /**
     * Retrieves whether the cleaning product is a spray.
     *
     * @return "Yes" if it is a spray, otherwise "No".
     */
    public String isSpray() {
        return spray ? "Yes" : "No";
    }

    /**
     * Retrieves the cleaning type of the product.
     *
     * @return The cleaning type (e.g., "Disinfectant", "Detergent").
     */
    public String getCleaningType() {
        return cleaningType;
    }

    /**
     * Retrieves the scent of the cleaning product.
     *
     * @return The scent of the product.
     */
    public String getScent() {
        return scent;
    }

    /**
     * Retrieves the volume of the cleaning product.
     *
     * @return The volume in ounces or liters.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Retrieves whether the product is flammable.
     *
     * @return "Yes" if the product is flammable, otherwise "No".
     */
    public String getFlammableStatus() {
        return flammable ? "Yes" : "No";
    }

    /**
     * Returns a string representation of the CleaningSupply object.
     *
     * @return A formatted string containing cleaning supply details.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nCleaning Type: " + cleaningType +
                " | Scent: " + scent +
                " | Volume: " + volume + " oz" +
                " | Spray: " + isSpray() +
                " | Flammable: " + getFlammableStatus();
    }

    /**
     * Creates a new CleaningSupply Item and new quantity
     *
     * @param quantity The quantity to assign to the cloned item.
     * @return a new CleaningSupply object with the same data with updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new CleaningSupply(getName(), getPrice(), quantity, getBrand(),getDescription(),
                getRoomType(), getDimensions(), getMaterial(), getWeight(),
                isFragile(), spray, getCleaningType(), scent,
                getVolume(), flammable);
    }




}
