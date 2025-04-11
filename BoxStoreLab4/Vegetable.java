/**
 * Vegetable.java
 * @author Harrison Hubbard
 * Date: 3/17/2025
 * Section: CSC-331-002
 *
 *  Purpose: Represents a vegetable item in the store's inventory.
 *  Extends the FoodItem class and includes attributes specific to vegetables,such as color, harvest date, storage type, and freshness level.
 *  Used to demonstrate inheritance and polymorphism in the shop system.
 */
import java.util.*;


public class Vegetable extends FoodItem{

    // Attributes
    private String color;
    private String harvestDate;
    private String storageRequirements;
    private String freshness;

    /**
     * Constructs a vegetable object with specified attributes
     *
     * @param name                  The name of the vegetable
     * @param price                 The price of the vegetable
     * @param quantity              The number of vegetables
     * @param brand                 The brand of vegetable
     * @param description           The description of the vegetable
     * @param weight                The weight of the vegetable
     * @param organic               If the vegetable is organic or not
     * @param origin                The origin of the vegetable
     * @param calories              The calories in the vegetable
     * @param expirationDate        The expiration date of the vegetable
     * @param color                 The color of the vegetable
     * @param harvestDate           The harvest date of the vegetable
     * @param storageRequirements   The storage requirements of the vegetable
     * @param freshness             The freshness of the vegetable
     */
    public Vegetable(String name, double price, int quantity, String brand, String description,
                     double weight, Boolean organic, String origin,
                     int calories, String expirationDate, String color,
                     String harvestDate, String storageRequirements, String freshness) {
        super(name, price, quantity, brand, description, weight, organic, origin, calories,expirationDate);
        this.color = color;
        this.harvestDate = harvestDate;
        this.storageRequirements = storageRequirements;
        this.freshness = freshness;
    }

    /**
     * Default constructor for Vegetable
     * Initializes an object with default values
     */
    public Vegetable() {
        super();
        this.color = null;
        this.harvestDate = null;
        this.storageRequirements = null;
        this.freshness = null;
    }

    // =================== Setters ===================

    /**
     * Sets the color of the vegetable
     * @param color the color of the vegetable
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Set's the harvest date of the vegetable
     * @param harvestDate the harvest date of the vegetable
     */
    public void setHarvestDate(String harvestDate){
        this.harvestDate = harvestDate;
    }

    /**
     * Set's the storage requirements for the vegetable
     * @param storageRequirements of the vegetable
     */
    public void setStorageRequirements(String storageRequirements) {
        this.storageRequirements = storageRequirements;
    }

    /**
     * Set's the freshness of the vegetable
     * @param freshness of a vegetable
     */
    public void setFreshness(String freshness) {
        this.freshness = freshness;
    }

    // =================== Getters ===================

    /**
     * Retrieves the color of the vegetable
     * @return the color of the vegetable
     */
    public String getColor() {
        return color;
    }

    /**
     * Retrieves the harvest date of the vegetable
     * @return the harvest date of the vegetable
     */
    public String getHarvestDate() {
        return harvestDate;
    }

    /**
     * Retrieves the storage requirements of the vegetable
     * @return the storage requirements of the vegetable
     */
    public String getStorageRequirements() {
        return storageRequirements;
    }

    /**
     * Retrieves the freshness of the vegetable
     * @return the freshness of the vegetable
     */
    public String getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nColor: " + color +
                " | Harvest Date: " + harvestDate +
                " | Storage Requirements: " + storageRequirements +
                " | Freshness: " + freshness ;
    }

    /**
     * Creates a copy of this Vegetable item with a new quantity
     *
     * @param quantity The quantity to assign to the cloned item.
     * @return A new vegetable object with the same data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new Vegetable(getName(), getPrice(), quantity, getBrand(),getDescription(),
                getWeight(), getOrganic(), getOrigin(), getCalories(),
                getExpirationDate(), getColor(), getHarvestDate(),
                getStorageRequirements(), getFreshness());
    }

}
