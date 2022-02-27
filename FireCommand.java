import java.io.FileNotFoundException;

/**
 * Handles fire command for player to use
 * @author Austin Hanson
 */
public class FireCommand implements Command {

    private Player player;

    /**
     * constructs a new FireCommand with given player
     * @param player
     */
    public FireCommand (Player player) {
        this.player = player;
    }
    
    /**
     * executres fire command for player
     */
    @Override
    public void execute() {
        try {
            player.fire();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
