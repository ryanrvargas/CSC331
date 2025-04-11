/**
 * FoodItem.java
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

public class FoodItem extends StoreItem {

    // Attributes
    private double weight;
    private Boolean organic;
    private String origin;
    private int calories;
    private String expirationDate;

    // Constructor

    /**
     * Constructor with all 6 attributes as parameters
     * @param name              The name of the Food item
     * @param price             The price of the Food item
     * @param quantity          The quantity of the Food item
     * @param brand             The brand of the food item
     * @param description       The description of the food item
     * @param weight            The weight of the food item
     * @param organic           If the food item is organic or not
     * @param origin            The origin of the food item
     * @param calories          The calories of the food item
     * @param expirationDate    The expiration date of the food item
     */
    public FoodItem (String name, double price, int quantity, String brand, String description, double weight,Boolean organic, String origin, int calories, String expirationDate){
        super(name,price,quantity,brand,description);
        this.weight = weight;
        this.organic = organic;
        this.origin = origin;
        this.calories = calories;
        this.expirationDate = expirationDate;
    }

    /**
     * No argument Constructor
     * This is equivalent to a default constructor
     */
    public FoodItem(){
        super();
        this.weight = 0;
        this.organic = null;
        this.origin = null;
        this.calories = 0;
        this.expirationDate = null;
    }

    // =================== Setters ===================

    /**
     * Set's the weight of the food item
     *
     * @param weight the weight of the food item
     */
    public void setWeight(double weight){
        this.weight = weight;
    }


    /**
     * Set's if the food item is organic or not
     * @param organic If the food is organic (true or false)
     */
    public void setOrganic(Boolean organic){
        this.organic = organic;
    }

    /**
     * Set's the origin of the food item
     *
     * @param origin the origin of the food item
     */
    public void setOrigin(String origin){
        this.origin = origin;
    }

    /**
     * Set's the food item's calories
     *
     * @param calories the food item's calories
     */
    public void setCalories(int calories){
        this.calories = calories;
    }

    /**
     * Set's the expirationDate of the food item
     *
     * @param expirationDate the date the food item expires
     */
    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }


    // =================== Getters ===================

    /**
     * Retrieves the weight of the food item
     *
     * @return the weight of the food item
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Retrieves the boolean value representing if the food item is organic or not
     *
     * @return True or False depending on the food item
     */
    public Boolean getOrganic(){
        return organic;
    }

    /**
     * Retrieves the place of origin of the food item
     *
     * @return the place of origin of the food item
     */
    public String getOrigin(){
        return origin;
    }

    /**
     * Retrieves the calories of the food item
     *
     * @return the amount of calories in the food item
     */
    public int getCalories(){
        return calories;
    }

    /**
     * Retrieves the expiration date of the food item
     *
     * @return the expiration date of the food item
     */
    public String getExpirationDate(){
        return expirationDate;
    }


    @Override
    public String toString(){
        return super.toString() + ".\nWeight: " + getWeight() + "Is Organic: " + getOrganic() + "Origin: " + getOrigin() + "Calorie Amount: " + getCalories() + "Expiration Date: " + getExpirationDate();
    }
}
