package Command;

public class Quit implements Command {

    @Override
    public String execute() {
        return "GAME OVER!";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
