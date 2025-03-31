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

    /**
     * loads the rooms, their directions and opponents from a file
     * @author partially my teacher and partially myself
     * @return information about the success of loading
     */
    public boolean loadMap(){
        try(BufferedReader br = new BufferedReader(new FileReader("rooms.txt"))){
            String line;
            while((line = br.readLine()) != null){
                String[] lines = line.split("/");
                if(Integer.parseInt(lines[0]) == 0 || Integer.parseInt(lines[0]) == 2 || Integer.parseInt(lines[0]) >=7 && Integer.parseInt(lines[0]) < 12){
                    Room room = new Room(Integer.parseInt(lines[0]),lines[1],Arrays.copyOfRange(lines, 2, 6));
                    map.put(Integer.valueOf(lines[0]), room);
                } else if (Integer.parseInt(lines[0]) == 1 || Integer.parseInt(lines[0]) >= 3 && Integer.parseInt(lines[0]) <=6) {
                    OpponentType type = null;
                    switch(Integer.parseInt(lines[7])){
                        case 1:
                            type = OpponentType.WARRIOR;
                            break;
                        case 2:
                            type = OpponentType.MASTIFF;
                            break;
                        case 3:
                            type = OpponentType.JESTER;
                            break;
                    }
                    Room room = new Room(Integer.parseInt(lines[0]),lines[1],Arrays.copyOfRange(lines, 2, 6), new Opponent(Integer.parseInt(lines[6]), type));
                    map.put(Integer.valueOf(lines[0]), room);
                }else if(Integer.parseInt(lines[0]) == 12){
                    Room room = new Room(Integer.parseInt(lines[0]),lines[1],Arrays.copyOfRange(lines, 2, 6), new Plum());
                    map.put(Integer.valueOf(lines[0]), room);
                }


            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setMap(HashMap<Integer, Room> map) {
        this.map = map;
    }

    public Room getCurrentRoom() {
        return map.get(currentRoom);
    }

    public HashMap<Integer, Room> getMap() {
        return map;
    }
}
