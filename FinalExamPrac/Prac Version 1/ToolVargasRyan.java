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
        if (weekendIncluded){
            double totalPrice = this.basePrice * days;
            double surcharge = totalPrice * .10;
            System.out.printf("Total Price: $%.2f\n", totalPrice + surcharge);
        }else{
            double totalPrice = this.basePrice * days;
            System.out.printf("Total Price: $%.2f\n", totalPrice);
        }
    }
    public double getBasePrice(){
        return this.basePrice;
    }
}
