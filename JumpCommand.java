import java.io.FileNotFoundException;

/**
 * Handles jump command for player to use
 * @author Avery Slomnicki
 */
public class JumpCommand implements Command {

    private Player player;

    /**
     * Constructs new jump command with given player
     * @param player
     */
    public JumpCommand(Player player) {
        this.player = player;
    }
    
    /**
     * executes jump command for player
     */
    @Override
    public void execute() {
        try {
            player.jump();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
