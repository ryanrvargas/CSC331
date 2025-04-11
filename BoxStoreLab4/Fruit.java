/**
 * Fruit.java
 * @author Harrison Hubbard
 * Date: 3/12/2025
 * Section: CSC-331-002
 *
 * Purpose: Represents a fruit item in the store's inventory.
 * Extends the FoodItem class and includes fruit-specific attributes such as color,
 * ripeness, and harvest date. Demonstrates inheritance and polymorphism within
 * the food category of the shop system.
 */
import java.util.*;



public class Fruit extends FoodItem {

    // Attributes
    private String color;
    private Boolean ripe;
    private String harvestDate;

    /**
     *
     * Constructs a Fruit object with specified attributes
     *
     * @param name              The name of the fruit
     * @param price             The price of the fruit
     * @param quantity          The amount of fruit
     * @param brand             The brand of fruit
     * @param description       The description of the fruit
     * @param weight            The weight of fruit
     * @param organic           If the fruit is organic or not
     * @param origin            The country of origin of the fruit
     * @param calories          The number of calories in the fruit
     * @param expirationDate    The expiration date of the fruit
     * @param color             The color of the fruit
     * @param ripe              Whether the fruit is ripe or not
     * @param harvestDate       The harvest Date of the fruit
     */
    public Fruit (String name, double price, int quantity, String brand, String description,
                        double weight, Boolean organic, String origin, int calories, String expirationDate,
                         String color, Boolean ripe, String harvestDate) {
        super(name, price, quantity, brand, description, weight, organic, origin, calories, expirationDate);
        this.color = color;
        this.ripe = ripe;
        this.harvestDate = harvestDate;
    }

    /**
     * Default constructor for Fruit
     * Initializes an object with default values
     */
    public Fruit() {
        super();
        this.color = null;
        this.ripe = null;
        this.harvestDate = null;
    }

    // =================== Setters ===================

    /**
     * Set's the color of the fruit
     * @param color The color of the fruit
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Set's if the fruit is ripe or not
     * @param ripe If the fruit is ripe or not
     */
    public void setRipe(Boolean ripe){
        this.ripe = ripe;
    }

    /**
     * Set's the harvest date of the fruit
     * @param harvestDate the harvest date of the fruit
     */
    public void setHarvestDate(String harvestDate) {
        this.harvestDate = harvestDate;
    }

    // =================== Getters ===================

    /**
     * Retrieves the color of fruit
     * @return the color of the fruit
     */
    public String getColor() {
        return color;
    }

    /**
     * Retrieves the ripeness of the fruit
     * @return if the fruit is ripe or not
     */
    public Boolean getRipe() {
        return ripe;
    }

    /**
     * Retrieves the harvest date of the fruit
     * @return the harvest date of the fruit
     */
    public String getHarvestDate() {
        return harvestDate;
    }

    /**
     * Returns a string representation of the Fruit object, including product details
     * from FoodItem and additional Fruit-specific attributes.
     *
     * @return A formatted string containing Fruit details.
     */
    @Override
    public String toString(){
        return super.toString() +
                "\nColor: " + color +
                " | Ripe: " + ripe +
                " | Harvest Date: " + harvestDate;

    }

    /**
     * Creates a new copy of Fruit item with a new quantity
     *
     * @param quantity The quantity to assign to the cloned item.
     * @return A new Fruit object with the same data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new Fruit(getName(), getPrice(), quantity, getBrand(),getDescription(),
                getWeight(), getOrganic(), getOrigin(), getCalories(),
                getExpirationDate(), getColor(), getRipe(), getHarvestDate());
    }
}
