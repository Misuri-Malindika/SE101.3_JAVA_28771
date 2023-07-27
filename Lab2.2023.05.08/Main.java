
/**
 *
 * @author Misuri
 */

class Monster extends Item {
    // Constructor method
    public Monster(int location, String description) {
        // Calling the constructor of the superclass (Item)
        super(location, description);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Item object
        Item item = new Item(1, "This is an item.");
        System.out.println("Item location: " + item.getLocation());
        System.out.println("Item description: " + item.getDescription());

        // Creating a Monster object
        Monster monster = new Monster(2, "This is a scary monster.");
        System.out.println("Monster location: " + monster.getLocation());
        System.out.println("Monster description: " + monster.getDescription());
    }
}
