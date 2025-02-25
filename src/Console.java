import Command.*;
import WorldStuff.Text;

import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private boolean exit = false;
    private HashMap<String, Command> commands = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

   public void initialize(){
       commands.put("go", new Go());
       commands.put("help", new Help());
       commands.put("inventory", new Inventory());
       commands.put("quit", new Quit());
       commands.put("investigate", new Investigate());
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
