package WorldStuff;


import java.util.Arrays;

public class Room {
    private int ID;
    private String name;
    private int[] directions;
    private Opponent opp;

    /**
     * Constructor for opponentless rooms
     * @param ID room ID
     * @param name room Name
     * @param directions directions in which you can go
     */
    public Room(int ID, String name, String[] directions) {
        this.ID = ID;
        this.name = name;
        this.directions = new int[4];
        for (int i = 0; i < directions.length; i++) {
            this.directions[i] = Integer.parseInt(directions[i]);
        }
    }

    /**
     * Constructor for rooms with an opponent
     * @param ID room ID
     * @param name room Name
     * @param directions directions in which you can go
     * @param opp Opponent located in the room
     */
    public Room(int ID, String name, String[] directions, Opponent opp) {
        this.ID = ID;
        this.name = name;
        this.directions = new int[4];
        for (int i = 0; i < directions.length; i++) {
            this.directions[i] = Integer.parseInt(directions[i]);
        }
        this.opp = opp;
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

    public Opponent getOpp() {
        return opp;
    }

    @Override
    public String toString() {
        return name;
    }
}
