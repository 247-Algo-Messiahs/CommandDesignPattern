import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Reads in run, jump, and fire txt files and prints actions to the terminal
 * @author Peyton Tucker, Austin Hanson, Nicolas Becker
 */
public class Player {

    /**
     * Prints "Our hero is born" upon creation of Player object
     */
    public Player() {
        System.out.println("Our hero is born");
    }

    /**
     * Reads in jump.txt file and prints out to terminal
     * @throws FileNotFoundException
     */
    public void jump() throws FileNotFoundException {
        File fileName = new File("CommandDesignPattern/jump.txt");
        Scanner input = new Scanner(fileName);
        List<String> list = new ArrayList<String>();
        while (input.hasNextLine()){
            list.add(input.nextLine());
        }

        input.close();
        clear();

        for (int i = 0; i < list.size(); i +=6 ){
            System.out.println(list.get(i) + "\n" + 
                               list.get(i+1) + "\n" +
                               list.get(i+2) + "\n" +
                               list.get(i+3) + "\n" +
                               list.get(i+4) + "\n" +
                               list.get(i+5));
            sleep();
            clear();
        }
    }

    /**
     * Reads in fire.txt file and prints out to terminal
     * @throws FileNotFoundException
     */
    public void fire() throws FileNotFoundException {
        File fileName = new File("CommandDesignPattern/fire.txt");
        Scanner input = new Scanner(fileName);
        List<String> list = new ArrayList<String>();

        while (input.hasNextLine()){
            list.add(input.nextLine());
        }

        input.close();
        clear();

        for (int i = 0; i < list.size(); i +=3 ){
            System.out.println(list.get(i) + "\n" + 
                               list.get(i+1) + "\n" +
                               list.get(i+2));
            sleep();
            clear();
        }

    }

    /**
     * Reads in run.txt file and prints out to terminal
     * @throws FileNotFoundException
     */
    public void runForward() throws FileNotFoundException {
        File fileName = new File("CommandDesignPattern/run.txt");
        Scanner input = new Scanner(fileName);
        List<String> list = new ArrayList<String>();
        while (input.hasNextLine()){
            list.add(input.nextLine());
        }

        input.close();
        clear();

        for (int i = 0; i < list.size(); i +=3 ){
            System.out.println(list.get(i) + "\n" + 
                               list.get(i+1) + "\n" +
                               list.get(i+2));
            sleep();
            clear();
        }
    }

    /**
     * Runs a counter to sleep actions by 100 for terminal outputs
     */
    private void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    /**
     * Clears the terminal of any text
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
}
