package WorldStuff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text {

    public static String loadIntro(){
        try(BufferedReader br = new BufferedReader(new FileReader("intro.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                return line;
            }
        }catch (IOException e){
            return "Oops! Something went wrong";
        }
        return "";
    }


}
