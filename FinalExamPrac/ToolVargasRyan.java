package FinalExamPrac;

public class ToolVargasRyan implements RentalVargasRyan {
    private String name;
    private double basePrice;

    public ToolVargasRyan(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getToolInfo(){
        return "Tool Name: " + this.name + "\nBase Price: $" + this.basePrice;
    }

    public void calculateRentalPrice(int days){
        double totalPrice = this.basePrice * days;
        System.out.println("Total Price: $" + totalPrice);
    }
    public void calculateRentalPrice(int days, boolean weekendIncluded){
        System.out.println("Total Price: $" + this.basePrice);
    }

    public double getBasePrice(){
        return this.basePrice;
    }
}
