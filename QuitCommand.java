/**
 * @author Avery Slomniki
 */
public class QuitCommand implements Command {

    /**
     * constructs quit command
     */
    public QuitCommand() {

    }
    
    /**
     * prints out exit message and closes terminal/quits program
     */
    @Override
    public void execute() {
        System.out.println("Hope you had fun. Goodbye!");
        System.exit(0);
        
    }
    
}
