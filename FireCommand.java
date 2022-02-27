import java.io.FileNotFoundException;

public class FireCommand implements Command {

    private Player player;

    public FireCommand (Player player) {
        this.player = player;
    }
    
    @Override
    public void execute() {
        try {
            player.fire();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
