package Command;

import WorldStuff.Mappington;
import WorldStuff.Room;

import java.util.Scanner;

public class Go implements Command {
    private Scanner sc = new Scanner(System.in);
    private Mappington map = new Mappington();
    private Room currentRoom = new Room();


    //TODO finish this thang T_T. I am simply too lazy and it's midnight on a school night xD
    //TODO ig this shouldn't have uhh... souts? I think?
    @Override
    public String execute() {
        currentRoom = map.getCurrentRoom();
        System.out.println("Where would you like to go? (up, down, left, right)");
        String input = sc.nextLine();
        System.out.println(currentRoom);
        switch (input) {
            case "up":
                if (currentRoom.getDirections()[3] != -1){
                    if (map.getMap().containsKey(currentRoom.getDirections()[3])){
                        currentRoom = map.getMap().get(currentRoom.getDirections()[3]);
                        return "Successfully moved up";
                    }
                }else {
                    return "There's no path that way";
                }
            case "down":
                if (currentRoom.getDirections()[1] != -1){
                    if (map.getMap().containsKey(currentRoom.getDirections()[1])){
                        currentRoom = map.getMap().get(currentRoom.getDirections()[1]);
                        return "Successfully moved down";
                    }
                }else {
                    return "There's no path that way";
                }
            case "left":
                if (currentRoom.getDirections()[2] != -1){
                    if (map.getMap().containsKey(currentRoom.getDirections()[2])){
                        currentRoom = map.getMap().get(currentRoom.getDirections()[2]);
                        return "Successfully moved to the left";
                    }
                }else {
                    return "There's no path that way";
                }
            case "right":
                if (currentRoom.getDirections()[0] != -1){
                    if (map.getMap().containsKey(currentRoom.getDirections()[0])){
                        currentRoom = map.getMap().get(currentRoom.getDirections()[0]);
                        return "Successfully moved to the right";
                    }
                }else {
                    return "There's no path that way";
                }
            default:
                return "Ain't no room like dat, homezawg";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
