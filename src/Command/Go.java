package Command;

import WorldStuff.Celadon;
import WorldStuff.Mappington;
import WorldStuff.Room;
import WorldStuff.FightOrFlight;

import java.util.Scanner;

public class Go implements Command {
    private Scanner sc = new Scanner(System.in);
    private Mappington map = new Mappington();
    private Room currentRoom = new Room();
    private Inventory inventory;

    public Go(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String execute() {
        currentRoom = map.getCurrentRoom();
        System.out.println("Where would you like to go? (up, down, left, right)");
        String input = sc.nextLine();
        System.out.println(currentRoom);
        if(currentRoom!=null) {
            switch (input) {
                case "up":
                    if (currentRoom.getDirections()[3] != -1) {
                        if (map.getMap().containsKey(currentRoom.getDirections()[3])) {
                            currentRoom = map.getMap().get(currentRoom.getDirections()[3]);
                            System.out.println("Successfully moved up");
                            break;
                        }
                    } else {
                        return "There's no path that way";
                    }
                case "down":
                    if (currentRoom.getDirections()[1] != -1) {
                        if (map.getMap().containsKey(currentRoom.getDirections()[1])) {
                            currentRoom = map.getMap().get(currentRoom.getDirections()[1]);
                            System.out.println("Successfully moved down");
                            break;
                        }
                    } else {
                        return "There's no path that way";
                    }
                case "left":
                    if (currentRoom.getDirections()[2] != -1) {
                        if (map.getMap().containsKey(currentRoom.getDirections()[2])) {
                            currentRoom = map.getMap().get(currentRoom.getDirections()[2]);
                            System.out.println("Successfully moved to the left");
                            break;
                        }
                    } else {
                        return "There's no path that way";
                    }
                case "right":
                    if (currentRoom.getDirections()[0] != -1) {
                        if (map.getMap().containsKey(currentRoom.getDirections()[0])) {
                            currentRoom = map.getMap().get(currentRoom.getDirections()[0]);
                            System.out.println( "Successfully moved to the right");
                            break;
                        }
                    } else {
                        return "There's no path that way";
                    }
                    default:
                    return "Ain't no direction like dat, homezawg";
            }
            if(currentRoom.getOpp()!=null){
                FightOrFlight fight = new FightOrFlight(new Celadon(inventory), currentRoom.getOpp());
            }
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
