/**
 * StoreItem.java
 * @author Ryan Vargas
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The Store class represents a general product available for sale.
 * It contains attributes such as name, price, quantity, and brand.
 * This class serves as a parent class for more specific product types.
 */
import java.util.*;

public class StoreItem {
    private String name;
    private double price;
    private int quantity;
    private String brand;
    private String description;


    /**
     * Constructs a Store object with specified attributes.
     *
     * @param name          The name of the product.
     * @param price         The price of the product.
     * @param quantity      The available stock quantity.
     * @param brand         The brand of the product. Defaults to "Generic" if null.
     * @param description   The description of the product
     */
    public StoreItem(String name, double price, int quantity, String brand, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = (brand != null) ? brand : "Generic";
        this.description = description;

    }


    /**
     * Default constructor for Store.
     * Initializes an object without setting any attributes.
     */
    public StoreItem() {
        this.name = "Unknown";
        this.price = 0;
        this.quantity = 0;
        this.brand = "Generic";
        this.description = "Generic";
    }

    /**
     * Retrieves product information in a formatted string.
     *
     * @return A string representation of the product, including name, brand, price, and stock quantity.
     */
    public String toString() {
        return name + " by " + brand + " - $" + String.format("%.2f", price) + " (Stock: " + quantity + ")" + "Description: " + description;
    }

    // =================== Getters ===================

    /**
     * Retrieves the name of the product.
     *
     * @return The product name.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return The product price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retrieves the available stock quantity.
     *
     * @return The quantity of the product in stock.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Retrieves the brand of the product.
     *
     * @return The product brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Retrieves description of the product
     *
     * @return The description of the product.
     */
    public String getDescription() { return description;}

    // =================== Setters ===================

    /**
     * Sets the name of the product.
     *
     * @param name The new name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the price of the product.
     *
     * @param price The new price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the stock quantity of the product.
     *
     * @param quantity The new stock quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets the brand of the product.
     *
     * @param brand The new brand of the product.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Sets the description of the product
     *
     * @param description the description of the product
     */
    public void setDescription(String description) {this.description = description;}

    /**
     * This method is used to simulate adding a specific quantity of an item to a shopping cart
     * while preserving the original inventory item in the store.
     *
     * @param quantity The quantity to assign to the cloned item.
     * @return A new StoreItem object with the same properties but updated quantity.
     */
    public StoreItem cloneWithQuantity(int quantity) {
        throw new UnsupportedOperationException("cloneWithQuantity() must be implemented in subclass.");
    }

}