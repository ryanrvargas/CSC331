import java.math.*;
public class instruments {
    //Attributes
    private String name;
    private String brand;
    private String price;

    //constructor
    public instruments(String name, String brand, String price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    //Behaviours
    public void setName(String names){
        this.name = names;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(String price){
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getPrice(){
        return this.price;
    }

    public String playMusic(String[] songs){
        String song = songs[(int)(Math.random()*songs.length)];
        return song;
    }

}

