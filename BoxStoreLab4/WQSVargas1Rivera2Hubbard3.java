/**
 * WQSVargas1Rivera2Hubbard3.java
 * This program demonstrates a simple shop where you can buy and sell items
 *
 * @author Ryan Vargas, Jovani Rivera, Harrison Hubbard
 * Date: 03-28-2025
 * Section: CSC-331-002
 *
 * Purpose: To demonstrate polymorphisim and inheritance through the different subclasses
 */

import javax.swing.*;
import java.util.*;

public class WQSVargas1Rivera2Hubbard3 {
    /**
     * Inventory lists for various item categories.
     */
    static ArrayList<Fruit> fruits = new ArrayList<>();
    static ArrayList<Vegetable> vegetables = new ArrayList<>();
    static ArrayList<ShelfStable> shelfStables = new ArrayList<>();
    static ArrayList<Furniture> furnitureItems = new ArrayList<>();
    static ArrayList<CleaningSupply> cleaningSupplies = new ArrayList<>();
    static ArrayList<Shirt> shirts = new ArrayList<>();
    static ArrayList<Shoe> shoes = new ArrayList<>();
    static ArrayList<Outerwear> outerwears = new ArrayList<>();
    static ArrayList<Laptop> laptops = new ArrayList<>();
    static ArrayList<Phone> phones = new ArrayList<>();
    static ArrayList<TV> tvs = new ArrayList<>();
    /**
     * Handles the item selling process by displaying categories, adding selected items to cart,
     * calculating totals, and showing order summaries.
     */
    public void sellItem() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<StoreItem> shoppingCart = new ArrayList<>();
        ArrayList<String> purchasedCategories = new ArrayList<>();

        while (true) {
            System.out.println("\n===== WILMINGTON QUICK SHOP =====");
            System.out.println("Select a category to shop:");
            System.out.println("0. Finish Shopping and Checkout");
            System.out.println("1. Food");
            System.out.println("2. Electronics");
            System.out.println("3. Clothing");
            System.out.println("4. Household");
            System.out.print("Enter your choice: ");

            int categoryChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (categoryChoice == 0) break;

            String category = "";
            switch (categoryChoice) {
                case 1:
                    category = "Food";
                    break;
                case 2:
                    category = "Electronics";
                    break;
                case 3:
                    category = "Clothing";
                    break;
                case 4:
                    category = "Household";
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            ArrayList<? extends StoreItem> availableItems = getItemListByCategory(category);
            if (availableItems.isEmpty()) {
                System.out.println("No items available in this category.");
                continue;
            }

            printTable(availableItems, category);

            while (true) {
                System.out.print("Enter item number to add to cart (0 to stop): ");
                int choice = scanner.nextInt();
                if (choice == 0) break;

                if (choice < 1 || choice > availableItems.size()) {
                    System.out.println("Invalid item number.");
                    continue;
                }

                StoreItem selectedItem = availableItems.get(choice - 1);
                System.out.print("Enter quantity (Available: " + selectedItem.getQuantity() + "): ");
                int quantity = scanner.nextInt();

                if (quantity < 1 || quantity > selectedItem.getQuantity()) {
                    System.out.println("Invalid quantity.");
                    continue;
                }

                StoreItem cartItem = createCartItem(selectedItem, quantity);
                if (cartItem != null) {
                    shoppingCart.add(cartItem);
                    selectedItem.setQuantity(selectedItem.getQuantity() - quantity);
                    if (!purchasedCategories.contains(category)) {
                        purchasedCategories.add(category);
                    }
                    System.out.println("Added to cart: " + cartItem.getName());
                }
            }
        }

        if (shoppingCart.isEmpty()) {
            System.out.println("No items purchased. Thanks for visiting!");
            return;
        }

        printOrderSummary(shoppingCart);
        System.out.print("Proceed to checkout? (yes/no): ");
        String confirm = scanner.next().toLowerCase();

        if (confirm.equals("yes")) {
            calculateTotal(shoppingCart);
            printInventory();
            displayReturnPolicyForCategories(purchasedCategories);
        } else {
            System.out.println("Order canceled. Returning to main menu.");
        }
    }
    /**
     * Returns a combined list of StoreItems based on the selected category.
     * @param category The item category name.
     * @return A list of StoreItems from that category.
     */
    private ArrayList<? extends StoreItem> getItemListByCategory(String category) {
        switch (category) {
            case "Food":
                ArrayList<StoreItem> foodItems = new ArrayList<>();
                foodItems.addAll(fruits);
                foodItems.addAll(vegetables);
                foodItems.addAll(shelfStables);
                return foodItems;

            case "Electronics":
                ArrayList<StoreItem> electronicItems = new ArrayList<>();
                electronicItems.addAll(laptops);
                electronicItems.addAll(phones);
                electronicItems.addAll(tvs);
                return electronicItems;

            case "Clothing":
                ArrayList<StoreItem> clothingItems = new ArrayList<>();
                clothingItems.addAll(shirts);
                clothingItems.addAll(shoes);
                clothingItems.addAll(outerwears);
                return clothingItems;

            case "Household":
                ArrayList<StoreItem> householdItems = new ArrayList<>();
                householdItems.addAll(furnitureItems);
                householdItems.addAll(cleaningSupplies);
                return householdItems;

            default:
                return new ArrayList<>(); // Return empty list if category doesn't match
        }
    }
    /**
     * Creates a copy of the selected StoreItem with the specified quantity.
     * @param originalItem The original StoreItem.
     * @param quantity The desired quantity for the cart.
     * @return A new StoreItem with the quantity set.
     */
    private StoreItem createCartItem(StoreItem originalItem, int quantity) {
        return originalItem.cloneWithQuantity(quantity);
    }

    /**
     * Displays a formatted table of items for the selected category.
     * @param items List of items to display.
     * @param category Name of the category.
     */
    private void printTable(ArrayList<? extends StoreItem> items, String category) {
        System.out.println("\n--- " + category + " Items ---");
        System.out.printf("%-4s %-20s %-10s %-15s %-40s\n", "#", "Name", "Price", "Brand", "Description");
        for (int i = 0; i < items.size(); i++) {
            StoreItem item = items.get(i);
            String brand = item.getBrand() != null ? item.getBrand() : "N/A";
            String desc = item.getDescription() != null ? item.getDescription() : "No description";
            System.out.printf("%-4d %-20s $%-9.2f %-15s %-40s\n",
                    (i + 1), item.getName(), item.getPrice(), brand, desc);
        }
    }
    /**
     * Prints a grouped order summary based on item types.
     * @param cart List of items in the shopping cart.
     */
    private void printOrderSummary(ArrayList<StoreItem> cart) {
        System.out.println("\n===== ORDER SUMMARY =====");
        Map<String, List<StoreItem>> grouped = new HashMap<>();

        for (StoreItem item : cart) {
            String category = item.getClass().getSimpleName();
            if (!grouped.containsKey(category)) {
                grouped.put(category, new ArrayList<StoreItem>());
            }
            grouped.get(category).add(item);
        }

        for (String category : grouped.keySet()) {
            System.out.println("\n--- " + category + " ---");
            for (StoreItem item : grouped.get(category)) {
                System.out.println(item.getQuantity() + " x " + item.getName() + " @ $" + item.getPrice());
            }
        }
    }
    /**
     * Calculates and prints subtotal, tax, and total cost of the order.
     * @param cart The shopping cart containing purchased items.
     */
    private void calculateTotal(ArrayList<StoreItem> cart) {
        double foodTax = 0.02;
        double nonFoodTax = 0.07;
        double subtotal = 0;
        double taxTotal = 0;

        for (StoreItem item : cart) {
            double itemTotal = item.getPrice() * item.getQuantity();
            double taxRate = isFood(item) ? foodTax : nonFoodTax;
            taxTotal += itemTotal * taxRate;
            subtotal += itemTotal;
        }

        double total = subtotal + taxTotal;

        System.out.printf("\nSubtotal: $%.2f\n", subtotal);
        System.out.printf("Tax:      $%.2f\n", taxTotal);
        System.out.printf("Total:    $%.2f\n", total);
    }
    /**
     * Determines if a StoreItem is a food item.
     * @param item The StoreItem to check.
     * @return true if it is a food item, false otherwise.
     */
    private boolean isFood(StoreItem item) {
        return item instanceof Fruit || item instanceof Vegetable || item instanceof ShelfStable;
    }

    /**
     * Displays return policies based on the categories of purchased items.
     * @param categories List of category names from the purchase.
     */
    private void displayReturnPolicyForCategories(List<String> categories) {
        System.out.println("\n===== RETURN POLICIES =====");

        for (String category : categories) {
            switch (category) {
                case "Food":
                    System.out.println("Food: No returns due to perishables.");
                    break;
                case "Electronics":
                    System.out.println("Electronics: 30-day return with receipt & original packaging.");
                    break;
                case "Clothing":
                    System.out.println("Clothing: 45-day return with tags, unworn.");
                    break;
                case "Household":
                    System.out.println("Household: 60-day return with original packaging.");
                    break;
                default:
                    System.out.println(category + ": No return policy available.");
            }
        }
    }

    /**
     * Handles the item addition process for all supported categories.
     * Prompts the user for input and adds new items to inventory lists.
     */
    public void addItem() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a category to add an item:");
            System.out.println("0. Exit");
            System.out.println("1. Food");
            System.out.println("2. Electronics");
            System.out.println("3. Clothing");
            System.out.println("4. Household");
            System.out.print("\nEnter your choice: ");
            int category = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (category == 0) {
                System.out.println("Come back soon!");
                break;
            }
            switch (category) {
                case 1: // Food
                    System.out.println("Select a Food type:");
                    System.out.println("1. Fruit");
                    System.out.println("2. Vegetable");
                    System.out.println("3. Shelf-Stable");
                    System.out.print("Enter your choice: ");
                    int foodChoice = scanner.nextInt();

                    switch (foodChoice) {
                        case 1:
                            printCategory(fruits, "Fruits");
                            scanner.nextLine();
                            System.out.print("Enter Fruit name: ");
                            String fruitName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double fruitPrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int fruitQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String fruitBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String fruitDescription = scanner.nextLine();
                            System.out.print("Enter weight: ");
                            double fruitWeight = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Is it organic? (true/false): ");
                            boolean fruitOrganic = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Enter origin: ");
                            String fruitOrigin = scanner.nextLine();
                            System.out.print("Enter calories: ");
                            int fruitCalories = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter expiration date: ");
                            String fruitExpiration = scanner.nextLine();
                            System.out.print("Enter color: ");
                            String fruitColor = scanner.nextLine();
                            System.out.print("Is it ripe? (true/false): ");
                            boolean fruitRipe = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Enter harvest date: ");
                            String fruitHarvestDate = scanner.nextLine();

                            fruits.add(new Fruit(fruitName, fruitPrice, fruitQuantity, fruitBrand, fruitDescription, fruitWeight, fruitOrganic, fruitOrigin, fruitCalories, fruitExpiration, fruitColor, fruitRipe, fruitHarvestDate));
                            System.out.println("Fruit added.");

                            break;
                        case 2:
                            printCategory(vegetables, "Vegetables");
                            scanner.nextLine();
                            System.out.print("Enter Vegetable name: ");
                            String vegetableName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double vegetablePrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int vegetableQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String vegetableBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String vegetableDescription = scanner.nextLine();
                            System.out.print("Enter weight: ");
                            double vegetableWeight = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Is it organic? (true/false): ");
                            boolean vegetableOrganic = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Enter origin: ");
                            String vegetableOrigin = scanner.nextLine();
                            System.out.print("Enter calories: ");
                            int vegetableCalories = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter expiration date: ");
                            String vegetableExpiration = scanner.nextLine();
                            System.out.print("Enter color: ");
                            String vegetableColor = scanner.nextLine();
                            System.out.print("Enter harvest date: ");
                            String vegetableHarvestDate = scanner.nextLine();
                            System.out.print("Enter storage type: ");
                            String vegetableStorage = scanner.nextLine();
                            System.out.print("Enter freshness level: ");
                            String vegetableFreshness = scanner.nextLine();

                            vegetables.add(new Vegetable(vegetableName, vegetablePrice, vegetableQuantity, vegetableBrand, vegetableDescription, vegetableWeight, vegetableOrganic, vegetableOrigin, vegetableCalories, vegetableExpiration, vegetableColor, vegetableHarvestDate, vegetableStorage, vegetableFreshness));
                            System.out.println("Vegetable added.");
                            break;
                        case 3:
                            printCategory(shelfStables, "Shelf-Stable Items");
                            scanner.nextLine();
                            System.out.print("Enter ShelfStable name: ");
                            String shelfStableName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double shelfStablePrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int shelfStableQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String shelfStableBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String shelfStableDescription = scanner.nextLine();
                            System.out.print("Enter weight: ");
                            double shelfStableWeight = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Is it organic? (true/false): ");
                            boolean shelfStableOrganic = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Enter origin: ");
                            String shelfStableOrigin = scanner.nextLine();
                            System.out.print("Enter calories: ");
                            int shelfStableCalories = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter expiration date: ");
                            String shelfStableExpiration = scanner.nextLine();
                            System.out.print("Enter packaging type: ");
                            String shelfStablePackaging = scanner.nextLine();
                            System.out.print("Enter manufacturing date: ");
                            String shelfStableManufacturingDate = scanner.nextLine();
                            System.out.print("Enter any warnings: ");
                            String shelfStableWarnings = scanner.nextLine();
                            System.out.print("Enter container material: ");
                            String shelfStableContainerMaterial = scanner.nextLine();

                            shelfStables.add(new ShelfStable(shelfStableName, shelfStablePrice, shelfStableQuantity, shelfStableBrand,shelfStableDescription, shelfStableWeight, shelfStableOrganic, shelfStableOrigin, shelfStableCalories, shelfStableExpiration, shelfStablePackaging, shelfStableManufacturingDate, shelfStableWarnings, shelfStableContainerMaterial));
                            System.out.println("ShelfStable item added.");
                            break;
                        default:
                            System.out.println("Invalid food choice.");
                            break;
                    }
                    break;

                case 2: // Electronics
                    System.out.println("Select an Electronics type:");
                    System.out.println("1. Laptop");
                    System.out.println("2. Phone");
                    System.out.println("3. TV");
                    System.out.print("Enter your choice: ");
                    int electronicsChoice = scanner.nextInt();


                    switch (electronicsChoice) {
                        case 1:
                            printCategory(laptops, "Laptops");
                            scanner.nextLine();
                            System.out.print("Enter Laptop name: ");
                            String laptopName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double laptopPrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int laptopQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String laptopBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String laptopDescription = scanner.nextLine();
                            System.out.print("Enter screen type: ");
                            String laptopScreenType = scanner.nextLine();
                            System.out.print("Is it touchscreen? (true/false): ");
                            boolean laptopTouchScreen = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Does it have Bluetooth? (true/false): ");
                            boolean laptopBluetooth = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Enter processor: ");
                            String processor = scanner.nextLine();
                            System.out.print("Enter operating system: ");
                            String operatingSystem = scanner.nextLine();
                            System.out.print("Enter RAM size (GB): ");
                            int ramSize = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter battery capacity: ");
                            int batteryCapacity = scanner.nextInt();
                            scanner.nextLine();

                            laptops.add(new Laptop(laptopName, laptopPrice, laptopQuantity, laptopBrand,laptopDescription, laptopScreenType, laptopTouchScreen, laptopBluetooth, processor, ramSize, batteryCapacity, operatingSystem));
                            System.out.println("Laptop added.");
                            break;
                        case 2:
                            printCategory(phones, "Phones");
                            scanner.nextLine();
                            System.out.print("Enter Phone name: ");
                            String phoneName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double phonePrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int phoneQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String phoneBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String phoneDescription = scanner.nextLine();
                            System.out.print("Enter screen type: ");
                            String phoneScreenType = scanner.nextLine();
                            System.out.print("Is it touchscreen? (true/false): ");
                            boolean phoneTouchScreen = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Does it have Bluetooth? (true/false): ");
                            boolean phoneBluetooth = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Enter color: ");
                            String phoneColor = scanner.nextLine();
                            System.out.print("Enter carrier: ");
                            String carrier = scanner.nextLine();
                            System.out.print("Enter model: ");
                            String phoneModel = scanner.nextLine();
                            System.out.print("Enter storage capacity (GB): ");
                            int storageCapacity = scanner.nextInt();
                            scanner.nextLine();

                            phones.add(new Phone(phoneName, phonePrice, phoneQuantity, phoneBrand, phoneDescription, phoneScreenType, phoneTouchScreen, phoneBluetooth, phoneColor, carrier, phoneModel, storageCapacity));
                            System.out.println("Phone added.");
                            break;
                        case 3:
                            printCategory(tvs, "TVs");
                            scanner.nextLine();
                            System.out.print("Enter TV name: ");
                            String tvName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double tvPrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int tvQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String tvBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String tvDescription = scanner.nextLine();
                            System.out.print("Enter model: ");
                            String tvModel = scanner.nextLine();
                            System.out.print("Enter resolution (e.g., 4K, 1080p): ");
                            String resolution = scanner.nextLine();
                            System.out.print("Enter screen size (inches): ");
                            int screenSize = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Is it a smart TV? (true/false): ");
                            boolean smartTV = scanner.nextBoolean();
                            scanner.nextLine();

                            tvs.add(new TV(tvName, tvPrice, tvQuantity, tvBrand, tvDescription, tvModel, resolution, screenSize, smartTV));
                            System.out.println("TV added.");
                            break;
                        default:
                            System.out.println("Invalid electronics choice.");
                            break;
                    }
                    break;

                case 3: // Clothing
                    System.out.println("Select a Clothing type:");
                    System.out.println("1. Shirt");
                    System.out.println("2. Shoe");
                    System.out.println("3. Outerwear");
                    System.out.print("Enter your choice: ");
                    int clothingChoice = scanner.nextInt();


                    switch (clothingChoice) {
                        case 1:
                            printCategory(shirts, "Shirts");
                            scanner.nextLine();
                            System.out.print("Enter Shirt name: ");
                            String shirtName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double shirtPrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int shirtQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String shirtBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String shirtDescription = scanner.nextLine();
                            System.out.print("Enter size: ");
                            String shirtSize = scanner.nextLine();
                            System.out.print("Enter color: ");
                            String shirtColor = scanner.nextLine();
                            System.out.print("Enter occasion: ");
                            String shirtOccasion = scanner.nextLine();
                            System.out.print("Enter material: ");
                            String shirtMaterial = scanner.nextLine();
                            System.out.print("Is there a design? (true/false): ");
                            boolean shirtDesign = scanner.nextBoolean();
                            scanner.nextLine();

                            shirts.add(new Shirt(shirtName, shirtPrice, shirtQuantity, shirtBrand,shirtDescription, shirtSize, shirtColor, shirtOccasion, shirtMaterial, shirtDesign));
                            System.out.println("Shirt added.");
                            break;
                        case 2:
                            printCategory(shoes, "Shoes");
                            scanner.nextLine();
                            System.out.print("Enter Shoe name: ");
                            String shoeName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double shoePrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int shoeQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String shoeBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String shoeDescription = scanner.nextLine();
                            System.out.print("Enter shoe size (as String): ");
                            String shoeSize = scanner.nextLine();
                            System.out.print("Enter occasion: ");
                            String shoeOccasion = scanner.nextLine();
                            System.out.print("Enter male or female: ");
                            String maleOrFemale = scanner.nextLine();
                            System.out.print("Does it have laces? (true/false): ");
                            boolean laces = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Is it high-top or low-top? ");
                            String highOrLow = scanner.nextLine();

                            shoes.add(new Shoe(shoeName, shoePrice, shoeQuantity, shoeBrand,shoeDescription, shoeSize, shoeOccasion, maleOrFemale, laces, highOrLow));
                            System.out.println("Shoe added.");
                            break;
                        case 3:
                            printCategory(outerwears, "Outerwear");
                            scanner.nextLine();
                            System.out.print("Enter Outerwear name: ");
                            String outerwearName = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double outerwearPrice = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Enter quantity: ");
                            int outerwearQuantity = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter brand: ");
                            String outerwearBrand = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String outerDescription = scanner.nextLine();
                            System.out.print("Enter material: ");
                            String outerwearMaterial = scanner.nextLine();
                            System.out.print("Enter size: ");
                            String outerwearSize = scanner.nextLine();
                            System.out.print("Enter season: ");
                            String outerwearSeason = scanner.nextLine();
                            System.out.print("Enter top or bottom (category): ");
                            String outerwearCategory = scanner.nextLine();
                            System.out.print("Is it waterproof? (true/false): ");
                            boolean isWaterProof = scanner.nextBoolean();
                            scanner.nextLine();
                            System.out.print("Is it hooded? (true/false): ");
                            boolean hooded = scanner.nextBoolean();
                            scanner.nextLine();

                            outerwears.add(new Outerwear(outerwearName, outerwearPrice, outerwearQuantity, outerwearBrand, outerDescription,outerwearMaterial, outerwearSize, outerwearSeason, outerwearCategory, isWaterProof, hooded));
                            System.out.println("Outerwear added.");
                            break;
                        default:
                            System.out.println("Invalid clothing choice.");
                            break;
                    }
                    break;

                case 4: // Household
                    System.out.println("Select a Household type:");
                    System.out.println("1. Furniture");
                    System.out.println("2. Cleaning Supply");
                    System.out.print("Enter your choice: ");
                    int householdChoice = scanner.nextInt();


                    switch (householdChoice) {
                        case 1:
                            printCategory(furnitureItems, "Furniture");
                            scanner.nextLine();
                            System.out.print("Enter Furniture name: ");
                            String name = scanner.nextLine();

                            System.out.print("Enter price: ");
                            double price = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline

                            System.out.print("Enter quantity: ");
                            int quantity = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            System.out.print("Enter brand: ");
                            String brand = scanner.nextLine();

                            System.out.print("Enter description: ");
                            String furnitureDescription = scanner.nextLine();

                            System.out.print("Enter room type (e.g., Living Room, Bedroom): ");
                            String roomType = scanner.nextLine();

                            System.out.print("Enter dimensions (e.g., 6x3x2 feet): ");
                            String dimensions = scanner.nextLine();

                            System.out.print("Enter material (e.g., Wood, Metal, Plastic): ");
                            String material = scanner.nextLine();

                            System.out.print("Enter weight (in pounds): ");
                            int weight = (int) scanner.nextInt();
                            scanner.nextLine(); //Consume newline

                            System.out.print("Is the furniture fragile? (true/false): ");
                            boolean fragile = scanner.nextBoolean();
                            scanner.nextLine(); //Consume newline

                            System.out.print("Enter furniture type (e.g., Table, Chair, Sofa): ");
                            String furnitureType = scanner.nextLine();

                            System.out.print("Enter style (e.g., Modern, Classic, Rustic): ");
                            String style = scanner.nextLine();

                            System.out.print("Enter color: ");
                            String color = scanner.nextLine();

                            System.out.print("Is the furniture assembled? (true/false): ");
                            boolean assembled = scanner.nextBoolean();
                            scanner.nextLine(); //Consume newline

                            // Create the Furniture object
                            Furniture furniture = new Furniture(name, price, quantity, brand, furnitureDescription,roomType, dimensions, material, (int) weight, fragile, furnitureType, style, color, assembled);
                            System.out.println("Furniture item added.");
                            break;
                        case 2:
                            printCategory(cleaningSupplies, "Cleaning Supplies");
                            scanner.nextLine();
                            System.out.print("Enter CleaningSupply name: ");
                            name = scanner.nextLine();

                            System.out.print("Enter price: ");
                            price = scanner.nextDouble();
                            scanner.nextLine();//Consume newline

                            System.out.print("Enter quantity: ");
                            quantity = scanner.nextInt();
                            scanner.nextLine();//Consume newline

                            System.out.print("Enter brand: ");
                            brand = scanner.nextLine();

                            System.out.print("Enter description: ");
                            String cleaningDescription = scanner.nextLine();

                            System.out.print("Enter room type (e.g., Kitchen, Bathroom): ");
                            roomType = scanner.nextLine();

                            System.out.print("Enter dimensions (e.g., 12x5x3 inches): ");
                            dimensions = scanner.nextLine();

                            System.out.print("Enter material (e.g., Plastic, Glass, Metal): ");
                            material = scanner.nextLine();

                            System.out.print("Enter weight (in grams): ");
                            weight = scanner.nextInt();
                            scanner.nextLine();//Consume newline

                            System.out.print("Is the item fragile? (true/false): ");
                            fragile = scanner.nextBoolean();
                            scanner.nextLine();//Consume newline

                            System.out.print("Is it a spray cleaner? (true/false): ");
                            boolean spray = scanner.nextBoolean();
                            scanner.nextLine();//Consume newline

                            System.out.print("Enter cleaning type (e.g., Disinfectant, Stain Remover): ");
                            String cleaningType = scanner.nextLine();

                            System.out.print("Enter scent (e.g., Lemon, Lavender, Unscented): ");
                            String scent = scanner.nextLine();

                            System.out.print("Enter volume (in ounces): ");
                            double volume = scanner.nextDouble();
                            scanner.nextLine();//Consume newline

                            System.out.print("Is the item flammable? (true/false): ");
                            boolean flammable = scanner.nextBoolean();
                            scanner.nextLine();//Consume newline

                            //Create the CleaningSupply object
                            CleaningSupply cleaningSupply = new CleaningSupply(name, price, quantity, brand,cleaningDescription, roomType, dimensions, material, (int) weight, fragile, spray, cleaningType, scent, volume, flammable);
                            System.out.println("Cleaning supply added.");
                            break;

                        default:
                            System.out.println("Invalid household choice.");
                            break;
                    }
                    break;

                default:
                    System.out.println("Invalid category.");
                    break;
            }
        }

    }


    /**
     * Displays the main menu for user interaction.
     */
    public static void displayMenu() {
        System.out.println("The Wilmington Quick Shop. Select category:");
        System.out.println("1. Add an item to the shop");
        System.out.println("2. Sell an item to a shop");
        System.out.println("3. Exit Shop ");
        System.out.print("Enter your selection: ");
    }
    /**
     * Prints the entire store inventory grouped by item categories.
     */
    public void printInventory() {
        System.out.println("\n========= STORE INVENTORY =========");


        printCategory(fruits, "Fruits");
        printCategory(vegetables, "Vegetables");
        printCategory(shelfStables, "Shelf-Stable Items");
        printCategory(furnitureItems, "Furniture");
        printCategory(cleaningSupplies, "Cleaning Supplies");
        printCategory(shirts, "Shirts");
        printCategory(shoes, "Shoes");
        printCategory(outerwears, "Outerwear");
        printCategory(laptops, "Laptops");
        printCategory(phones, "Phones");
        printCategory(tvs, "TVs");


        System.out.println("\n========= END OF INVENTORY =========\n");
    }
    /**
     * Generic method to print a category list.
     * @param list The list of items in that category.
     * @param categoryName The name of the category.
     * @param <T> Type extending StoreItem.
     */
    private <T> void printCategory(ArrayList<T> list, String categoryName) {
        if (!list.isEmpty()) {
            System.out.println("\n--- " + categoryName + " ---");
            for (T item : list) {
                System.out.println(item.toString());//Calls the `toString()` method of each object
            }
        }
        else {
            System.out.println("\n--- " + categoryName + " --- No items found.");
        }
    }

    /**
     * Main method to run the shopping application.
     * Displays the menu and handles user selection.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        WQSVargas1Rivera2Hubbard3 manager = new WQSVargas1Rivera2Hubbard3();
        Scanner scanner = new Scanner(System.in);
        while (true){
            displayMenu();
            int user = scanner.nextInt();
            switch (user) {
                case 1://Add
                    manager.addItem();
                    manager.printInventory();
                    break;
                case 2://Sell
                    manager.sellItem();
                    manager.printInventory();
                    break;
                case 3://Exit
                    break;
            }
        }


    }

}