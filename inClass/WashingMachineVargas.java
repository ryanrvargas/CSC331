public class WashingMachineVargas {
    private String brand;
    private String model;
    private double price;

    public WashingMachineVargas(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public double getPrice() {return price;}

    //Know sales price
    public double salePrice(){
        double sales = price * 0.05;
        return this.price - sales;
    }

}
