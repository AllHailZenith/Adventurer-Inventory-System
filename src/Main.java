public class Main {
    public static void main(String[] args) {
        Bag backpack = new Bag("Main Backpack", 2.0);

        Item bedroll = new Item("Bedroll", 4.0);
        Item rope = new Item("Rope", 3.0);
        Item sword = new Item("Iron Sword", 3.5);

        Bag potionPouch = new Bag("Potion Pouch", 0.5);
        potionPouch.add(new Item("Health Potion", 0.5));
        potionPouch.add(new Item("Mana Potion", 0.5));

        Bag bagOfHolding = new Bag("Bag of Holding", 1.0);
        bagOfHolding.add(new Item("Gold Coins", 1.5));

        Bag gemBag = new Bag("Gem Bag", 0.2);
        gemBag.add(new Item("Ruby", 0.1));
        gemBag.add(new Item("Emerald", 0.1));

        bagOfHolding.add(gemBag);

        backpack.add(bedroll);
        backpack.add(rope);
        backpack.add(sword);
        backpack.add(potionPouch);
        backpack.add(bagOfHolding);

        System.out.println("=== Complete Inventory ===");
        backpack.displayInfo();
        System.out.println("Total backpack weight: "
                + backpack.getWeight() + " lbs");

        System.out.println("\n=== Potion Pouch Only ===");
        potionPouch.displayInfo();
        System.out.println("Total potion pouch weight: "
                + potionPouch.getWeight() + " lbs");

        System.out.println("\n=== Unsupported Operation Test ===");
        try {
            sword.add(new Item("Dagger", 1.0));
        } catch (UnsupportedOperationException e) {
            System.out.println("Warning: Individual items cannot contain other items.");

        }
    }
}