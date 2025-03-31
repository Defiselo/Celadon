package Command;

import WorldStuff.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory implements Command {
    private ArrayList<Item> items = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    /**
     * Credit to my IT teacher for most of the method
     * @return returns closing line when the desired action is exit
     */
    @Override
    public String execute() {
        if (items.isEmpty()) {
            return "You don't have any items!";
        }

        while (true) {
            System.out.println("What would you like to do in your inventory? (list/drop/exit)");
            String action = sc.next().toLowerCase();

            switch (action) {
                case "list":
                    listItems();
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


    private void listItems() {
        System.out.println("Your Inventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName());
        }
    }


    private void dropItem() {
        System.out.println("Enter the item name to drop:");
        String itemName = sc.nextLine();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(itemName)) {
                System.out.println("You dropped " + items.get(i).getName() + "!");
                items.remove(i);
                return;
            }
            System.out.println("Item not found!");
        }
    }

    public int getTotalCharisma(){
        int total = 0;
        for (Item item : items){
            total += item.getCharisma();
        }
        return total;
    }
    public int getTotalStrength(){
        int total = 0;
        for (Item item : items){
            total += item.getStrength();
        }
        return total;
    }

    public int getTotalHealth(){
        int total = 0;
        for (Item item : items){
            total += item.getStrength();
        }
        return total;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
