import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Mappington {
    private int start = 0;
    private int currentPosition = start;
    private HashMap<Integer,Room> map = new HashMap<>();

    public boolean loadMap(){
        try(BufferedReader br = new BufferedReader(new FileReader("rooms.txt"))){
            String line;
            while((line = br.readLine()) != null){
                String[] lines = line.split("/");
                Room room = new Room(
                        lines[1],
                        Integer.parseInt(lines[0]),
                        Integer.parseInt(Arrays.copyOfRange(lines, 2, 5));
                );
            }


            return true;
        } catch (IOException e) {
            return false;
        }


    }



}
