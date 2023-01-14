import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int MAX = 1000;
        int randint = rand.nextInt(MAX);
       // System.out.println(randint);
        System.out.println("Random value have been generated between 0 to " + MAX);
        boolean notfound = true;
        while (notfound) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Input a possible int : ");
            int guessint = scan.nextInt();


            if (guessint == randint) {
                notfound = false;
            } else if (guessint < randint) {
                System.out.println("The input num is smaller. ");
            } else if (guessint > randint) {
                System.out.println("The input num is bigger. ");
            }
        }
        System.out.println("Congras, you find the number "+ randint);
    }

}


