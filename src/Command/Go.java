package Command;

import WorldStuff.Celadon;
import WorldStuff.Mappington;
import WorldStuff.Room;
import WorldStuff.FightOrFlight;

import java.util.Arrays;
import java.util.Scanner;

public class Go implements Command {
    private Scanner sc = new Scanner(System.in);
    private Mappington map;
    private Room currentRoom;
    private Celadon celadon;

    public Go(Mappington map, Celadon celadon) {
        this.map = map;
        this.celadon = celadon;
        map.loadMap();
        currentRoom = map.getCurrentRoom();
    }

    /**
     * Handles movement and fighting the opponents in their respective rooms
     * @return movement status
     * @author me
     */
    @Override
    public String execute() {
        int vrooom;
        System.out.println("Where would you like to go? (up, down, left, right)");
        String input = sc.nextLine().trim().toLowerCase();
        System.out.println("You are in " + currentRoom);
        if(currentRoom!=null) {
            switch (input) {
                case "up":
                    if (currentRoom.getDirections()[0] != -1) {
                        vrooom = currentRoom.getDirections()[0];
                        if (map.getMap().containsKey(vrooom)) {
                            currentRoom = map.getMap().get(vrooom);
                            map.setCurrentRoom(vrooom);
                            System.out.println("You are going to " + currentRoom);
                            if(currentRoom.getOpp()!=null){
                                System.out.println("While trying to move up, you were intercepted by an enemy");
                                FightOrFlight fight = new FightOrFlight(celadon, currentRoom.getOpp());
                            }
                            return "Successfully moved up";
                        }
                    } else {
                        return "There's no path that way";
                    }
                case "down":
                    if (currentRoom.getDirections()[1] != -1) {
                        vrooom = currentRoom.getDirections()[1];
                        if (map.getMap().containsKey(vrooom)) {
                            currentRoom = map.getMap().get(vrooom);
                            map.setCurrentRoom(vrooom);
                            System.out.println("You are going to " + currentRoom);
                            if(currentRoom.getOpp()!=null){
                                System.out.println("While moving to down, an enemy suddenly attacked you");
                                FightOrFlight fight = new FightOrFlight(celadon, currentRoom.getOpp());
                            }
                            return "Successfully moved down";
                        }
                    } else {
                        return "There's no path that way";
                    }
                case "left":
                    if (currentRoom.getDirections()[2] != -1) {
                        vrooom = currentRoom.getDirections()[2];
                        if (map.getMap().containsKey(vrooom)) {
                            currentRoom = map.getMap().get(vrooom);
                            map.setCurrentRoom(vrooom);
                            System.out.println("You are going to " + currentRoom);
                            if(currentRoom.getOpp()!=null){
                                System.out.println("On your way to the left, a battle broke out between you and an enemy");
                                FightOrFlight fight = new FightOrFlight(celadon, currentRoom.getOpp());
                            }
                            return "Successfully moved to the left";

                        }
                    } else {
                        return "There's no path that way";
                    }
                case "right":


                    if (currentRoom.getDirections()[3] != -1) {
                        vrooom = currentRoom.getDirections()[3];
                        if (map.getMap().containsKey(vrooom)) {
                            currentRoom = map.getMap().get(vrooom);
                            map.setCurrentRoom(vrooom);
                            System.out.println("You are going to " + currentRoom);
                            if(currentRoom.getOpp()!=null){
                                System.out.println("Moving right proved to be a bad idea, as you were assaulted by an oncoming enemy");
                                FightOrFlight fight = new FightOrFlight(celadon, currentRoom.getOpp());
                            }
                            return "Successfully moved to the right";
                        }else{
                            System.out.println("Map aint doin shit");
                        }
                    } else {
                        return "There's no path that way";
                    }
                    default:
                    return "Ain't no direction like dat, homezawg";
            }

        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
