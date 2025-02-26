public class WMTestVargas {
    public static void main(String[] args) {
        WashingMachineVargas[] washers = {new WashingMachineVargas("LG", "001", 428.48),
                                            new WashingMachineVargas("KitchenAid", "AID-001", 683.12),
                                            new WashingMachineVargas("Wash", "The washer-001", 924.58)};

        for(WashingMachineVargas washer : washers){
           System.out.printf("Make: %s, Model: %s, Price: %f, Sales Price: %f.2%n",washer.getBrand(),washer.getModel(),washer.getPrice(),washer.salePrice());
        }
    }
}
