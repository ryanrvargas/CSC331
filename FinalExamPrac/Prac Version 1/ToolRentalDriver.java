package FinalExamPrac;

public class ToolRentalDriver {
    public static void main(String[] args) {
        DrillVargas dewalt = new DrillVargas("Dewalt", 10.00);
        DrillVargas milwakee = new DrillVargas("Milwakee", 100.00);
        Ladder stepUp = new Ladder("Step Up", 150.00);

        ToolVargasRyan[] tool = {dewalt, milwakee, stepUp};

        dewalt.calculateRentalPrice(3);
        milwakee.calculateRentalPrice(3);
        stepUp.calculateRentalPrice(3);

        dewalt.calculateRentalPrice(3,true);
        milwakee.calculateRentalPrice(3,true);
        stepUp.calculateRentalPrice(3,true);


    }
}
