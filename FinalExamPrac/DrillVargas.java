package FinalExamPrac;

public class DrillVargas extends ToolVargasRyan{

    public DrillVargas(String name, double basePrice){
        super(name, basePrice);
    }

    @Override
    public void calculateRentalPrice(int days){
        double totalPrice = (getBasePrice() * days) + 5;
        System.out.println("Total Price: $" + totalPrice);
    }
}
