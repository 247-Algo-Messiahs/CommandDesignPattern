import java.util.concurrent.TimeUnit;

public class Player {

    public Player() {
        System.out.print("Our her is born");
    }

    public void jump() {

    }

    public void fire() {

    }

    public void runForward() {
        
    }

    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
}
