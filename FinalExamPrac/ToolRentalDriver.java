package FinalExamPrac;

import java.util.ArrayList;

public class ToolRentalDriver {
    public static void main(String[] args){
        DrillVargas Milwakee = new DrillVargas("Milwakee", 50.00);
        DrillVargas Dewalt = new DrillVargas("Dewalt", 15.00);
        Ladder Lowes = new Ladder("Lowes", 10.00);

        ToolVargasRyan[] tools = {Milwakee, Dewalt, Lowes};
        for (ToolVargasRyan tool : tools){

    }



    }
}
