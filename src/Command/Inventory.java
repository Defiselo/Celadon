package Command;

import WorldStuff.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory implements Command {
    private ArrayList<Item> items = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    @Override
    public String execute() {
        if(items.isEmpty()) {
            return "You don't have any items!";
        }
        System.out.println("What would you like to do in your inventory?"); //questionable sout
        String thang = sc.next();
        //TODO finish the method lol
        return "You close your inventory and return to your adventure";
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
        for (int i = 0; i < items.size(); i++) {
         if (items.get(i) == item) {
             items.remove(i);
             return true;
         }
        }
        return false;
    }




}
