/**
 * Shirt.java
 * @author Jovani Rivera-Hernandez
 * Date: March 16, 2025
 * Section: 331 002
 *
 * The Shirt class represents shirt products available in a store.
 * It extends the Store class and includes attributes specific to shirts,
 * such as size, color, occasion, material, design.
 */

public class Shirt extends StoreItem {
    /**
     * private attributes representing shirt details
     */
    private String size;
    private String color;
    private String occasion;
    private String material;
    private boolean design;

    /**
     * constructor to initialize shirt with given parameters
     * @param name          The name of the shirt
     * @param price         The price of the shirt
     * @param quantity      The quantity of the shirt
     * @param brand         The brand of the shirt
     * @param description   The description of the shirt
     * @param size          The size of the shirt
     * @param color         The color of the shirt
     * @param occasion      The occasion of the shirt
     * @param material      The material of the shirt
     * @param design        The design of the shirt
     */
    public Shirt (String name, double price, int quantity, String brand,String description, String size, String color, String occasion, String material, boolean design){
        super(name, price, quantity, brand,description);
        this.size = size;
        this.color = color;
        this.occasion = occasion;
        this.material = material;
        this.design = design;
    }

    // =================== Setters ===================

    /**
     * updates the size of the shirt
     * @param size the size of the shirt
     */
    public void setSize(String size) {this.size = size;}

    /**
     * updates the color of the shirt
     * @param color the color of the shirt
     */
    public void setColor(String color) {this.color = color;}

    /**
     * updates the occasion of the shirt
     * @param occasion the occasion of the shirt
     */
    public void setOccasion(String occasion) {this.occasion = occasion;}

    /**
     * updates the material of the shirt
     * @param material the material of the shirt
     */
    public void setMaterial(String material) {this.material = material;}

    /**
     * updates if shirt has a design or not
     * @param design the design of the shirt
     */
    public void setDesign(boolean design) {this.design = design;}


    // =================== Getters ===================


    /**
     * Retrieves the size of the shirt
     *
     * @return the size of the shirt
     */
    public String getSize() {return size;}

    /**
     * Retrieves the color of the shirt
     * @return the color of the shirt
     */
    public String getColor() {return color;}

    /**
     * Retrieves the occasion of the shirt
     * @return the occasion of the shirt
     */
    public String getOccasion() {return occasion;}

    /**
     * Retrieves the material of the shirt
     * @return the material of the shirt
     */
    public String getMaterial() {return material;}

    /**
     * Retrieves the design of the shirt
     * @return the design of the shirt
     */
    public boolean isDesign() {return design;}


    /**
     * Returns a string representation of the ClothingItem object, including
     * product details from the parent class and additional shirt specified attributes
     * @return a formatted string containing product details.
     */
    @Override
    public String toString() {
        return super.toString() + ".\nShirt size is: " + getSize() +
                " | Shirt color is: " + getColor() +
                " | Occasion of shirt: " + getOccasion() + " | Shirt is made of: " + getMaterial() +
                " | Does shirt have a design: " + isDesign();
    }

    /**
     * Creates a copy of the Shirt item with a new quantity
     *
     * @param quantity The quantity to assign to the cloned item.
     * @return A new Shirt object with the same data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new Shirt(getName(), getPrice(), quantity, getBrand(),getDescription(),
                getSize(), getColor(), getOccasion(), getMaterial(), isDesign());
    }

}
