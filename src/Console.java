import Command.*;
import WorldStuff.Mappington;
import WorldStuff.Text;

import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private boolean exit = false;
    private HashMap<String, Command> commands = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    private Mappington map = new Mappington();
    private Inventory inv = new Inventory();

   public void initialize(){
       commands.put("go", new Go(inv));
       commands.put("help", new Help());
       commands.put("inventory", inv);
       commands.put("quit", new Quit());
       commands.put("investigate", new Investigate(inv));
   }

   public void useCommand(){
       System.out.print(">>>");
       String command = sc.nextLine();
       command = command.trim();
       command = command.toLowerCase();
       if(commands.containsKey(command)){
           System.out.println(">>> " + commands.get(command).execute());
       }else{
           System.out.println(">>> Unknown command");
       }
   }
    public void start(){
        initialize();
        map.loadMap();
        String text = Text.loadIntro();
        System.out.println(text);
        try{
            do {
                useCommand();
            }while(!exit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
