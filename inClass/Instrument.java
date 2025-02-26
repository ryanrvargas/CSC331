/**
 * @author Mrs. White
 * Date: 2/5/2025
 * Class: CSC 331 (001, 002, 003)
 * Purpose: Provide an example of a basic class
 */
public class Instrument {
    //Attributes
    private String family;
    private String material;
    private double price;
    private String name;
    private String brand;
    private String manufacturedAt;

    //Behaviors

    //Constructor
    public Instrument (String family, String material, double price, String name, String brand, String manufacturedAt){
        this.family = family;
        this.material = material;
        this.price = price;
        this.brand = brand;
        this.name = name;
        this.manufacturedAt = manufacturedAt;
    }
    public Instrument (String family, String material, double price, String name){
        this.family = family;
        this.material = material;
        this.price = price;
        this.name = name;
    }

    //Getters or Accessors
    public String getFamily() {
        return family;
    }

    public String getMaterial(){
        return material;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getBrand(){
        return brand;
    }

    public String getManufacturedAt(){
        return manufacturedAt;
    }

    //Setters or Mutators

    public void setFamily(String family){
        this.family = family;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setManufacturedAt(String manufacturedAt) {
        this.manufacturedAt = manufacturedAt;
    }

    public String playMusic(String[] songs){
        String song = songs[(int)(Math.random()*songs.length)];
        return song;
    }
}
