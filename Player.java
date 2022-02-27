import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Player {

    public Player() {
        System.out.println("Our hero is born");
    }

    public void jump() throws FileNotFoundException {
        File fileName = new File("CommandDesignPattern/jump.txt");
        Scanner input = new Scanner(fileName);
        List<String> list = new ArrayList<String>();
        while (input.hasNextLine()){
            list.add(input.nextLine());
        }

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

    public void fire() throws FileNotFoundException {
        File fileName = new File("CommandDesignPattern/fire.txt");
        Scanner input = new Scanner(fileName);
        List<String> list = new ArrayList<String>();

        while (input.hasNextLine()){
            list.add(input.nextLine());
        }

        clear();

        for (int i = 0; i < list.size(); i +=3 ){
            System.out.println(list.get(i) + "\n" + 
                               list.get(i+1) + "\n" +
                               list.get(i+2));
            sleep();
            clear();
        }

    }

    public void runForward() throws FileNotFoundException {
        File fileName = new File("CommandDesignPattern/run.txt");
        Scanner input = new Scanner(fileName);
        List<String> list = new ArrayList<String>();
        while (input.hasNextLine()){
            list.add(input.nextLine());
        }

        clear();
        
        for (int i = 0; i < list.size(); i +=3 ){
            System.out.println(list.get(i) + "\n" + 
                               list.get(i+1) + "\n" +
                               list.get(i+2));
            sleep();
            clear();
        }
    }

    private void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
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
