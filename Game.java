import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("what is your name??");
        String name = scan.nextLine();
        System.out.println("Well," + name + "I am thinking of a number between 1 to 100!");
        int myNumber = getRandomNumber(1, 101);

        for (int i = 0; i < 6; i++) {

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Take a Guess..");
            int yourGuess = scan2.nextInt();

            if (yourGuess == myNumber) {
                System.out.println("You Guessed Correctly");
                break;

            } else if (yourGuess < myNumber) {

                System.out.println("your guess is too low...");

            } else if (yourGuess > myNumber) {

                System.out.println("Your Guess is too high...");

            }

            if (i >= 5) {

                System.out.println();
                System.out.println("Nope , The number I was thinking of was " + myNumber + "!");

            }

        }

    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.ints(min, max).findFirst().getAsInt();
    }

}
