package FinalExamPrac;

public class Ladder extends ToolVargasRyan{
    public Ladder(String name, double basePrice){
        super(name, basePrice);
    }
    @Override
    public double calculateRentalPrice(int days){
        double totalPrice = getBasePrice() * days;
        double discount = totalPrice * .1;
        return totalPrice - discount;

    }
}
