import Command.Inventory;
import WorldStuff.Item;
import WorldStuff.ItemType;
import WorldStuff.Mappington;

public class Main {
    public static void main(String[] args) {
        Mappington mappa = new Mappington();

        System.out.println(mappa.getCurrentRoom());
    }
}