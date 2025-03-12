package Command;

import WorldStuff.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory implements Command {
    private ArrayList<Item> items = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public String execute() {
        if (items.isEmpty()) {
            return "You don't have any items!";
        }

        while (true) {
            System.out.println("What would you like to do in your inventory? (list/use/drop/exit)");
            String action = sc.next().toLowerCase();

            switch (action) {
                case "list":
                    listItems();
                    break;
                case "use":
                    useItem();
                    break;
                case "drop":
                    dropItem();
                    break;
                case "exit":
                    return "You close your inventory and return to your adventure";
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }

    @Override
    public boolean exit() {
        return false;
    }

    public boolean addItem(Item item) {
        if (item != null) {
            items.add(item);
            return true;
        }
        return false;
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    private void listItems() {
        System.out.println("Your Inventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName());
        }
    }

    private void useItem() {
        System.out.println("Enter the item name to use:");
        String itemName = sc.next();
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                System.out.println("You used " + item.getName() + "!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    private void dropItem() {
        System.out.println("Enter the item name to drop:");
        String itemName = sc.next();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(itemName)) {
                System.out.println("You dropped " + items.get(i).getName() + "!");
                items.remove(i);
                return;
            }
        }
        System.out.println("Item not found!");
    }
}
