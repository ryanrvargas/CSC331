package FinalExamPrac;

public class DrillVargas extends ToolVargasRyan{
    private String name;
    private double basePrice;

    public DrillVargas(String name, double basePrice){
        super(name, basePrice);
    }

    @Override
    public void calculateRentalPrice(int days){
        double totalPrice = this.basePrice * days;
        System.out.println("Total Price: $" + totalPrice + 5);
    }
}
