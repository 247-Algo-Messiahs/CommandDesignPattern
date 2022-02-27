import java.io.FileNotFoundException;

public class RunCommand implements Command {
    
    private Player player;

    public RunCommand(Player player) {
        this.player = player;
    }
    
    @Override
    public void execute() {
        try {
            player.runForward();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
