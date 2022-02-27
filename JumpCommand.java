import java.io.FileNotFoundException;

public class JumpCommand implements Command {

    private Player player;

    public JumpCommand(Player player) {
        this.player = player;
    }
    
    @Override
    public void execute() {
        try {
            player.jump();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
