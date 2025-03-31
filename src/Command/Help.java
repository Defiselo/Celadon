package Command;

public class Help implements Command {
    @Override
    public String execute() {
        return "Usable commands: \nhelp, quit, go, investigate, inventory";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
