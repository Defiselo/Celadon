package WorldStuff;

public class Plum extends Opponent{
    private static boolean isDefeated = false;

    public Plum() {
        this.level = 100;
        this.strength = 45;
        this.health = 130;
        this.charismaThreshold = 9001; // It's over 9000 lul :P
    }

    public static boolean isIsDefeated() {
        return isDefeated;
    }

    public static void setIsDefeated(boolean isDefeated) {
        Plum.isDefeated = isDefeated;
    }
}
