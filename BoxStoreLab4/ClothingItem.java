/**
 * ClothingItem.java
 * @author Ryan Vargas
 * Date: March 14, 2025
 * Section: 331 002
 *
 * The ClothingItem class represents a clothing product available in the store.
 * It extends Store and includes additional attributes such as material, size,
 * season, and whether the item is a top or bottom.
 */
public class ClothingItem extends StoreItem {
    private String material;
    private String size;
    private String season;
    private String topOrBottom;

    /**
     * Constructs a ClothingItem object with specified attributes.
     *
     * @param name          The name of the clothing item.
     * @param price         The price of the clothing item.
     * @param quantity      The available stock quantity.
     * @param brand         The brand of the clothing item.
     * @param description   The description of the clothing item.
     * @param material      The material type of the clothing (e.g., cotton, wool, polyester).
     * @param size          The size of the clothing (e.g., S, M, L, XL).
     * @param season        The season for which the clothing is designed (e.g., summer, winter).
     * @param topOrBottom   Specifies whether the clothing is a "Top" or "Bottom".
     */
    public ClothingItem(String name, double price, int quantity, String brand,String description, String material, String size, String season, String topOrBottom) {
        super(name, price, quantity, brand,description);
        this.material = material;
        this.size = size;
        this.season = season;
        this.topOrBottom = topOrBottom;
    }

    /**
     * Default constructor for ClothingItem.
     * Initializes an object with default empty values.
     */
    public ClothingItem() {
        super();
        this.material = "";
        this.size = "";
        this.season = "";
        this.topOrBottom = "";
    }


    // =================== Setters ===================

    /**
     * Sets the material of the clothing item.
     *
     * @param material The new material (e.g., cotton, wool, polyester).
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Sets the size of the clothing item.
     *
     * @param size The new size of the clothing (e.g., S, M, L, XL).
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Sets the season for which the clothing item is designed.
     *
     * @param season The new season (e.g., summer, winter, spring, fall).
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     * Sets whether the clothing item is a top or bottom.
     *
     * @param topOrBottom "Top" if the item is worn on the upper body, "Bottom" if worn on the lower body.
     */
    public void setTopOrBottom(String topOrBottom) {
        this.topOrBottom = topOrBottom;
    }


    // =================== Getters ===================

    /**
     * Retrieves the material of the clothing item.
     *
     * @return The clothing material (e.g., cotton, wool, polyester).
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Retrieves the size of the clothing item.
     *
     * @return The size of the clothing (e.g., S, M, L, XL).
     */
    public String getSize() {
        return size;
    }

    /**
     * Retrieves the season for which the clothing item is designed.
     *
     * @return The season (e.g., summer, winter, spring, fall).
     */
    public String getSeason() {
        return season;
    }

    /**
     * Retrieves whether the clothing item is a top or bottom.
     *
     * @return "Top" if the clothing item is worn on the upper body, "Bottom" if worn on the lower body.
     */
    public String getTopOrBottom() {
        return topOrBottom;
    }


    /**
     * Returns a string representation of the ClothingItem object, including product details
     * from the parent class and additional clothing-specific attributes.
     *
     * @return A formatted string containing clothing details.
     */
    @Override
    public String toString() {
        return super.toString() +
                ".\nMaterial: " + getMaterial() +
                " | Size: " + getSize() +
                " | Season: " + getSeason() +
                " | Top or Bottom: " + getTopOrBottom();
    }
}
