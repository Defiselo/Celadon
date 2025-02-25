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

            case "east":

            case "north":

            case "south":

            default:
        }
        return null;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
