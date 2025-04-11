/**
 * Shoe.java
 * @author Jovani Rivera-Hernandez
 * Date: March 12, 2025
 * Section: 331 002
 *
 * The shoe class represents shoe products available in a store.
 * It extends the Store class and includes attributes specific to shoes,
 * such as size, occasion, male or female, laces, hightop or lowtop.
 */


public class Shoe extends StoreItem {
    /**
     * private attributes representing shoe details
     */
    private String size;
    private String occasion;
    private String maleOrFemale;
    private boolean laces;
    private String hightopOrLowtop;

    /**
     * constructor to initialize shoe with given parameters
     * @param name                  The name of the shoe
     * @param price                 The price of the shoe
     * @param quantity              The quantity of the shoe
     * @param brand                 The brand of the shoe
     * @param description           The description of the shoe
     * @param size                  The size of the shoe
     * @param occasion              The occasion you'd wear the shoe
     * @param maleOrFemale          Male of Female size for the shoe
     * @param laces                 The laces of the shoe
     * @param hightopOrLowtop       If the shoe is high or low
     */
    public Shoe (String name, double price, int quantity, String brand,String description, String size, String occasion, String maleOrFemale, boolean laces, String hightopOrLowtop){
        super(name, price, quantity, brand,description);
        this.size = size;
        this.occasion = occasion;
        this.maleOrFemale = maleOrFemale;
        this.laces = laces;
        this.hightopOrLowtop = hightopOrLowtop;
    }

    // =================== Setters ===================
    /**
     * updates the size of the shoe
     * @param size the size of the shoe
     */
    public void setSize(String size) {this.size = size;}

    /**
     * updates the occasion of the shoe
     * @param occasion the occasion of the shoe
     */
    public void setOccasion(String occasion) {this.occasion = occasion;}

    /**
     * updates if shoe is a male or female shoe
     * @param maleOrFemale whether its a male or female shoe
     */
    public void setMaleOrFemale(String maleOrFemale) {this.maleOrFemale = maleOrFemale;}

    /**
     * updates if shoe has laces or not
     * @param laces if the shoe has laces (True or False)
     */
    public void setLaces(boolean laces) {this.laces = laces;}

    /**
     * updates if shoe is a hightop or lowtop
     * @param hightopOrLowtop if the shoe is high or low top
     */
    public void setHightopOrLowtop(String hightopOrLowtop) {this.hightopOrLowtop = hightopOrLowtop;}


    // =================== Getters ===================

    /**
     * Retrieves size
     *
     * @return size of the shoe
     */
    public String getSize() {return  size;}

    /**
     * Retrieves the occasions of when to wear the shoe
     *
     * @return occasion the occasion of when to wear the shoe
     */
    public String getOccasion() {return occasion;}

    /**
     * Retrieves if the shoe is for male or females
     *
     * @return the gender that the shoe is made for
     */
    public String getMaleOrFemale() {return maleOrFemale;}

    /**
     * Retrieves if the shoe has laces
     *
     * @return laces if the shoe has laces or not (True or False)
     */
    public boolean isLaces() {return laces;}

    /**
     * Retrieves if the shoe is high or low top
     *
     * @return if the shoe is high or low top
     */
    public String getHightopOrLowtop() {return hightopOrLowtop;}

    /**
     * Returns a string representation of the ClothingItem object, including
     * product details from the parent class and additional shoe-specific attributes.
     *
     * @return A formatted string containing product details.
     */
    @Override
    public String toString() {
        return super.toString() + ".\nShoe size is: " + getSize() +
                " | Occasion is: " + getOccasion() +
                " | Male or Female shoe: " + getMaleOrFemale() + " | Has laces: " + isLaces() + " | Is shoe a hightop or lowtop: " + getHightopOrLowtop() ;
    }

    /**
     * Creates a copy of this Shoe item with a new quantity
     * @param quantity The quantity to assign to the cloned item.
     * @return A new Shoe object with the same data and updated quantity
     */
    @Override
    public StoreItem cloneWithQuantity(int quantity) {
        return new Shoe(getName(), getPrice(), quantity, getBrand(),getDescription(),
                getSize(), getOccasion(), getMaleOrFemale(), isLaces(), getHightopOrLowtop());
    }

}
