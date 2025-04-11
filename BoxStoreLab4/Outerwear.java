/**
 * Outwear.java
 * @uahtor Jovani Rivera-Hernandez
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The Outerwear class represents outerwear products available in a store.
 * It extends the ClothingItem class and includes attributes specific to outerwear,
 * such as material, size, season, top or bottom, waterproof capability, and whether it has a hood.
 *
 * From Ryan: I made some adjustments since this class is an extension of ClothingItems.
 */

public class Outerwear extends ClothingItem {
    private boolean isWaterProof;
    private boolean hooded;

    /**
     * Constructs an Outerwear object with specified attributes.
     *
     * @param name          The name of the outerwear item.
     * @param price         The price of the outerwear item.
     * @param quantity      The available stock quantity.
     * @param brand         The brand of the outerwear item.
     * @param description   The description of the outerwear item.
     * @param material      The material type (e.g., wool, leather, synthetic).
     * @param size          The size of the outerwear item (e.g., S, M, L, XL).
     * @param season        The season for which the outerwear is designed (e.g., winter, fall).
     * @param topOrBottom   Specifies whether the outerwear is a "Top" or "Bottom".
     * @param isWaterProof  Indicates if the outerwear is waterproof.
     * @param hooded        Indicates if the outerwear has a hood.
     */
    public Outerwear(String name, double price, int quantity, String brand, String description, String material, String size, String season, String topOrBottom,
                     boolean isWaterProof, boolean hooded) {
        super(name, price, quantity, brand, description, material, size, season, topOrBottom);
        this.isWaterProof = isWaterProof;
        this.hooded = hooded;
    }

    /**
     * Default constructor for Outerwear.
     * Initializes an object with default values.
     */
    public Outerwear() {
        super();
        this.isWaterProof = false;
        this.hooded = false;
    }

    // =================== Setters ===================

    /**
     * Sets whether the outerwear is waterproof.
     *
     * @param isWaterProof true if the outerwear is waterproof, false otherwise.
     */
    public void setWaterProof(boolean isWaterProof) {
        this.isWaterProof = isWaterProof;
    }

    /**
     * Sets whether the outerwear has a hood.
     *
     * @param hooded true if the outerwear has a hood, false otherwise.
     */
    public void setHooded(boolean hooded) {
        this.hooded = hooded;
    }



    // =================== Getters ===================

    /**
     * Retrieves whether the outerwear is waterproof.
     *
     * @return true if the outerwear is waterproof, false otherwise.
     */
    public boolean isWaterProof() {
        return isWaterProof;
    }

    /**
     * Retrieves whether the outerwear has a hood.
     *
     * @return true if the outerwear has a hood, false otherwise.
     */
    public boolean isHooded() {
        return hooded;
    }


    /**
     * Returns a string representation of the Outerwear object, including
     * product details from ClothingItem and additional outerwear-specific attributes.
     *
     * @return A formatted string containing outerwear details.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nIs waterproof: " + isWaterProof +
                " | Hooded: " + hooded;
    }

    /**
     * Creates a copy of Outerwear item with a new quantity
     *
     * @param quantity The quantity to assign to the cloned item.
     * @return A new Outerwear object with data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new Outerwear(getName(), getPrice(), quantity, getBrand(),getDescription(),
                getMaterial(), getSize(), getSeason(), getTopOrBottom(),
                isWaterProof(), isHooded());
    }

}
