package FinalExamPrac;

public class DrillVargas extends ToolVargasRyan{

    public DrillVargas(String name, double basePrice){
        super(name, basePrice);
    }

    @Override
    public double calculateRentalPrice(int days){
        return (getBasePrice() * days) + 5;

    }
}
