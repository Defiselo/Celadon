package WorldStuff;


import java.util.Arrays;

public class Room {
    private int ID;
    private String name;
    private int[] directions;


    public Room(int ID, String name, String[] directions) {
        this.ID = ID;
        this.name = name;
        this.directions = new int[4];
        for (int i = 0; i < directions.length; i++) {
            this.directions[i] = Integer.parseInt(directions[i]);
        }
    }

    public Room() {
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int[] getDirections() {
        return directions;
    }

    @Override
    public String toString() {
        return "Room{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", directions=" + Arrays.toString(directions) +
                '}';
    }
}
