package Command;

public class Help implements Command {
    @Override
    public String execute() {
        return "Usable commands: \n help, quit, go, investigate, inventory";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
