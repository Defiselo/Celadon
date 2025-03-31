package Command;

public class Quit implements Command {

    @Override
    public String execute() {
        return "You decided to exit the game";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
