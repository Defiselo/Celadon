package WorldStuff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Mappington {
    private int start = 0;
    private int currentRoom = start;
    private HashMap<Integer, Room> map = new HashMap<>();

    public boolean loadMap(){
        try(BufferedReader br = new BufferedReader(new FileReader("rooms.txt"))){
            String line;
            while((line = br.readLine()) != null){
                String[] lines = line.split("/");
                Room room = new Room(Integer.parseInt(lines[0]),lines[1],Arrays.copyOfRange(lines, 2, 5)
                );
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public Room getCurrentRoom() {
        return map.get(currentRoom);
    }

    public HashMap<Integer, Room> getMap() {
        return map;
    }
}
