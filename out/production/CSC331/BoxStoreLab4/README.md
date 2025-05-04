
# Wilmington Quick Shop


## Description of Project and Technologies Used

In this project, our team collaborated to develop a **store inventory and shopping system** for Wilmington Quick Shop as part of our coursework. The goal was to apply **object-oriented programming** concepts such as **inheritance**, **polymorphism**, and **abstraction** using Java.

The system allows users to add, view, and sell a wide range of items across multiple categories such as Food, Electronics, Clothing, and Household items. It supports item-specific behaviors while maintaining a unified structure through polymorphism.

### Backend

- **Java**: Core language for implementation. Java's class system allowed for rich object-oriented design using class hierarchies and polymorphism.

- **Inheritance & Polymorphism**: The program uses a base `StoreItem` class with common fields (name, price, quantity, brand, description), and extends it into subclasses like `Fruit`, `Phone`, `Shoe`, etc. Each subclass implements a `cloneWithQuantity(int)` method to enable polymorphic behavior for cart management.

- **UML Documentation**: Class structures and relationships are documented in UML diagrams to demonstrate design clarity and extensibility.

- **JUnit (if applicable)**: Tests could be used to validate functionality and ensure methods like `cloneWithQuantity()` and inventory updates behave correctly.

### User Interface

- **Command Line Interface (CLI)**: Users interact with the system through a menu-driven console interface where they can:
  - Add new items to the store inventory by category and type
  - Browse inventory
  - Sell items by adding them to a cart, confirming quantities, checking out, and applying tax
  - View return policies based on item categories

### Key Features

- Inventory grouped by:
  - 🥕 Food: Fruit, Vegetable, Shelf-Stable
  - 💻 Electronics: Laptop, Phone, TV
  - 👕 Clothing: Shirt, Shoe, Outerwear
  - 🧼 Household: Furniture, Cleaning Supply

- Dynamic tax calculation:
  - Food: 2% tax
  - Non-Food: 7% tax

- Real-time inventory deduction upon checkout

- Polymorphic item cloning with `cloneWithQuantity()`

- Return policy display based on items purchased

---

## Sample API Behavior (Console Interaction)

Although this system does not include a web API, here is a sample of how the system behaves during interaction:

### Start Menu
```
The Wilmington Quick Shop. Select category:
1. Add an item to the shop
2. Sell an item to a shop
3. Exit Shop
Enter your selection: 
```

### Sell Flow
```
===== WILMINGTON QUICK SHOP =====
Select a category to shop:
1. Food
2. Electronics
3. Clothing
4. Household
0. Finish Shopping and Checkout
```

### Cart Summary
```
Order Summary:
- 2x Apple ($1.50)
- 1x Phone ($699.99)
Subtotal: $702.99
Tax: $49.60
Total: $752.59
```

### Return Policy (after checkout)
```
===== RETURN POLICY =====
Food Items: No returns due to perishable nature.
Electronics: 30-day return with original packaging and receipt.
```

---

## Team Contributors

- Ryan Vargas  
- Jovani Rivera  
- Harrison Hubbard

## GitHub 
https://github.com/ryanrvargas/BoxStoreLab4
