/**
 * Householditem.java
 * @author Ryan Vargas
 * Date: March 14, 2025
 * Section: 331 002
 *
 * The HouseholdItem class represents household products available in the store.
 * It extends StoreItem and includes attributes specific to household items,
 * such as room type, dimensions, material, weight, and whether the item is fragile.
 */
public class HouseholdItem extends StoreItem {
    private String roomType;
    private String dimensions;
    private String material;
    private int weight;
    private boolean fragile;

    /**
     * Constructs a HouseholdItem object with specified attributes.
     *
     * @param name          The name of the household item.
     * @param price         The price of the item.
     * @param quantity      The available stock quantity.
     * @param brand         The brand of the item.
     * @param description   The description of the item.
     * @param roomType      The room where the item is typically used (e.g., Kitchen, Living Room).
     * @param dimensions    The dimensions of the item (e.g., "12x24x8 inches").
     * @param material      The material of the item (e.g., Wood, Plastic, Metal).
     * @param weight        The weight of the item in pounds or kilograms.
     * @param fragile       Indicates if the item is fragile (true if fragile, false otherwise).
     */
    public HouseholdItem(String name, double price, int quantity, String brand, String description,
                         String roomType, String dimensions, String material, int weight, boolean fragile) {
        super(name, price, quantity, brand, description);
        this.roomType = roomType;
        this.dimensions = dimensions;
        this.material = material;
        this.weight = weight;
        this.fragile = fragile;
    }

    /**
     * Default constructor for HouseholdItem.
     * Initializes an object with default values.
     */
    public HouseholdItem() {
        super();
        this.roomType = "";
        this.dimensions = "";
        this.material = "";
        this.weight = 0;
        this.fragile = false;
    }

    // =================== Setters ===================

    /**
     * Sets the room type where the household item is used.
     *
     * @param roomType The new room type (e.g., Kitchen, Living Room).
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * Sets the dimensions of the household item.
     *
     * @param dimensions The new dimensions (e.g., "12x24x8 inches").
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Sets the material of the household item.
     *
     * @param material The new material (e.g., Wood, Plastic, Metal).
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Sets the weight of the household item.
     *
     * @param weight The new weight in pounds or kilograms.
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Sets whether the household item is fragile.
     *
     * @param fragile true if the item is fragile, false otherwise.
     */
    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    // =================== Getters ===================

    /**
     * Retrieves the room type where the household item is used.
     *
     * @return The room type (e.g., Kitchen, Living Room).
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Retrieves the dimensions of the household item.
     *
     * @return The dimensions in a formatted string (e.g., "12x24x8 inches").
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * Retrieves the material of the household item.
     *
     * @return The material type (e.g., Wood, Plastic, Metal).
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Retrieves the weight of the household item.
     *
     * @return The weight in pounds or kilograms.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Checks if the household item is fragile.
     *
     * @return true if the item is fragile, false otherwise.
     */
    public boolean isFragile() {
        return fragile;
    }

    /**
     * Returns a string representation of the HouseholdItem object, including product details
     * from StoreItem and additional household-specific attributes.
     *
     * @return A formatted string containing household item details.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nRoom Type: " + roomType +
                " | Dimensions: " + dimensions +
                " | Material: " + material +
                " | Weight: " + weight + " lbs" +
                " | Fragile: " + fragile;
    }
}
