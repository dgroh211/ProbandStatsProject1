import java.util.Scanner;

/**
 * This program is used to test the Game Show Curtain Problem.
 *
 * Dillon Groh
 */
public class TestGameShow
{
    public static void main(String[] args) {
        //Call the GameShow class
        GameShow solution = new GameShow();
        //Initializes the amount of iterations we want the game run at
        int iterations = 10000;

        System.out.println("Probability of winning without switching: " + solution.probabilityWithoutSwitching(iterations)+ "%");

        System.out.println("Probability of winning by switching: " + solution.probabilityWithSwitching(iterations) + "%");
    }
}
