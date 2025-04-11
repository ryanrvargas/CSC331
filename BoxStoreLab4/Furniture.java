/**
 * Furniture.java
 * @author Ryan Vargas
 * Date: March 14, 2025
 * Section: 331 002
 * The Furniture class represents furniture items available in the store.
 * It extends HouseholdItem and includes attributes specific to furniture,
 * such as furniture type, style, color, and whether the item is pre-assembled.
 */
public class Furniture extends HouseholdItem {
    private String furnitureType;
    private String style;
    private String color;
    private boolean assembled;

    /**
     * Constructs a Furniture object with specified attributes.
     *
     * @param name          The name of the furniture item.
     * @param price         The price of the furniture item.
     * @param quantity      The available stock quantity.
     * @param brand         The brand of the furniture item.
     * @param description   The description of the furniture item.
     * @param roomType      The room where the furniture is typically used.
     * @param dimensions    The dimensions of the furniture (e.g., "80x40x30 inches").
     * @param material      The material of the furniture (e.g., "Wood", "Metal").
     * @param weight        The weight of the furniture in pounds or kilograms.
     * @param fragile       Indicates if the furniture is fragile.
     * @param furnitureType The type of furniture (e.g., "Chair", "Table", "Bed").
     * @param style         The furniture style (e.g., "Modern", "Rustic").
     * @param color         The color of the furniture.
     * @param assembled     Indicates if the furniture is pre-assembled.
     */
    public Furniture(String name, double price, int quantity, String brand, String description,
                     String roomType, String dimensions, String material, int weight, boolean fragile,
                     String furnitureType, String style, String color, boolean assembled) {
        super(name, price, quantity, brand, description, roomType, dimensions, material, weight, fragile);
        this.furnitureType = furnitureType;
        this.style = style;
        this.color = color;
        this.assembled = assembled;
    }

    /**
     * Default constructor for Furniture.
     * Initializes an object with default values.
     */
    public Furniture() {
        super();
        this.furnitureType = "";
        this.style = "";
        this.color = "";
        this.assembled = false;
    }

    // =================== Setters ===================

    /**
     * Sets the type of furniture.
     *
     * @param furnitureType The furniture type (e.g., "Chair", "Table", "Bed").
     */
    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    /**
     * Sets the style of the furniture.
     *
     * @param style The furniture style (e.g., "Modern", "Rustic").
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Sets the color of the furniture.
     *
     * @param color The new color of the furniture.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Sets whether the furniture is pre-assembled.
     *
     * @param assembled true if the furniture is pre-assembled, false otherwise.
     */
    public void setAssembled(boolean assembled) {
        this.assembled = assembled;
    }

    // =================== Getters ===================

    /**
     * Retrieves the type of furniture.
     *
     * @return The furniture type (e.g., "Chair", "Table", "Bed").
     */
    public String getFurnitureType() {
        return furnitureType;
    }

    /**
     * Retrieves the style of the furniture.
     *
     * @return The furniture style (e.g., "Modern", "Rustic").
     */
    public String getStyle() {
        return style;
    }

    /**
     * Retrieves the color of the furniture.
     *
     * @return The color of the furniture.
     */
    public String getColor() {
        return color;
    }

    /**
     * Checks if the furniture is pre-assembled.
     *
     * @return true if the furniture is pre-assembled, false otherwise.
     */
    public boolean isAssembled() {
        return assembled;
    }


    /**
     * Returns a string representation of the Furniture object, including product details
     * from HouseholdItem and additional furniture-specific attributes.
     *
     * @return A formatted string containing furniture details.
     */
    @Override
    public String toString(){
        return super.toString() +
                "\nFurniture: " + getFurnitureType() +
                " | Style: " + getStyle() +
                " | Color: " + getColor() +
                " | Assembled: " + isAssembled();
    }

    /**
     * Creates a new Furniture item and with a new quantity
     *
     * @param quantity The quantity to assign to the cloned item.
     * @return A new furniture object with the same data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new Furniture(getName(), getPrice(), quantity, getBrand(), getDescription(),
                getRoomType(), getDimensions(), getMaterial(), getWeight(),
                isFragile(), getFurnitureType(), getStyle(), getColor(), isAssembled());
    }


}
