package FinalExamPrac;

public class ToolVargasRyan implements RentalVargasRyan {
    private String name;
    private double basePrice;

    public ToolVargasRyan(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getToolInfo(){
        return  String.format("Name: " + this.name + "\nBase Price: $" + this.basePrice);
    }

    public double calculateRentalPrice(int days){
        return this.basePrice * days;

    }

    public double calculateRentalPrice(int days, boolean weekendIncluded){
        double totalPrice = this.basePrice * days;
        if (weekendIncluded){
            double surcharge = totalPrice * .10;
            totalPrice += surcharge;
        }
        return totalPrice;
    }
    public double getBasePrice(){
        return this.basePrice;
    }
}
