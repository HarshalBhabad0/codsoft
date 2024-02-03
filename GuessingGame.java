import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowest = 1;
        int highest = 100;

        int randomNum = random.nextInt(lowest,highest);
        int gnum;
        System.out.println("---------------------");
        System.out.println("This is Guessing Game");
        System.out.println("---------------------");
        System.out.println("Guess number from 1 to 100");

        while (true) {
            System.out.print("Enter your guess: ");
            gnum = scanner.nextInt();

            if (gnum < randomNum) {
                System.out.println("Too low Guess Again.");
            } else if (gnum > randomNum) {
                System.out.println("Too high Guess again.");
            } else {
                System.out.println("Hurray! You guessed it correct. The number is:" + randomNum);
                break;
            }
        }

        scanner.close();
    }
}
