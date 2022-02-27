import java.io.FileNotFoundException;

/**
 * Handles jump command for player
 * @author Avery Slomnicki
 */
public class RunCommand implements Command {
    
    private Player player;

    /**
     * Constructs new run command with given player
     * @param player
     */
    public RunCommand(Player player) {
        this.player = player;
    }
    
    /**
     * executes run command for player
     */
    @Override
    public void execute() {
        try {
            player.runForward();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
