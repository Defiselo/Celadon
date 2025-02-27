import Command.Inventory;
import WorldStuff.Item;
import WorldStuff.ItemType;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addItem(new Item("Knife", ItemType.WEAPON));
    }
}