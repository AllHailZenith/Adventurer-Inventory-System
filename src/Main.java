public class Main {
    public static void main(String[] args) {
        Bag pouch = new Bag("Belt Pouch", 0.5);

        Item potion = new Item("Health Potion", 0.5);
        Item scroll = new Item("Magic Scroll", 0.2);

        pouch.add(potion);
        pouch.add(scroll);

        pouch.displayInfo();
        System.out.println("Total pouch weight: " + pouch.getWeight() + " lbs");
    }
}