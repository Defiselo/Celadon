public class Room {
    private int ID;
    private String name;
    private int[] directions = new int[4];

    public Room(int ID, String name, int[] directions) {
        this.ID = ID;
        this.name = name;
        this.directions = directions;
    }
}
