import java.util.HashMap;

/**
 * Fills a hashmap with commands that can be called on with buttonPressed
 * @author Peyton Tucker
 */
public class InputHandler {
    
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    /**
     * fills hashmap with Player commands
     * @param player
     */
    public InputHandler(Player player) {
        this.commands = new HashMap<String,Command>();
        this.commands.put("jump", new JumpCommand(player));
        this.commands.put("run", new RunCommand(player));
        this.commands.put("fire", new FireCommand(player));
        this.commands.put("quit", new QuitCommand());
    }

    /**
     * executes given command
     * @param command
     */
    public void buttonPressed(String command) {
        Command com = this.commands.get(command);
        com.execute();
    }

}
