package WorldStuff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text {
    private static String stuff = "";

    /**
     * Loads and displays text from file
     * @return The text you load from the file
     * @author IT teacher (edited slightly by me)
     */
    public static String loadIntro(){
        try(BufferedReader br = new BufferedReader(new FileReader("intro.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                stuff += line + "\n";
            }
            return stuff;
        }catch (IOException e){
            return "Oops! Something went wrong";
        }
    }


}
