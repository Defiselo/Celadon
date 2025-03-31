package WorldStuff;

import java.util.Random;

public class Plum extends Opponent{
    private static boolean isDefeated = false;
    private Random rd = new Random();
    private int typeNumber = rd.nextInt(1)+1;

    public Plum() {
        this.level = 100;
        this.strength = 45;
        this.health = 130;
        this.charismaThreshold = 9001; // It's over 9000 lul :P
        switch (typeNumber){
            case 1:
                this.type = OpponentType.WARRIOR;
                break;
            case 2:
                this.type = OpponentType.MASTIFF;
                break;
        }
    }

    public static boolean isIsDefeated() {
        return isDefeated;
    }

    public static void setIsDefeated(boolean isDefeated) {
        Plum.isDefeated = isDefeated;
    }
}
