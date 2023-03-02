import java.util.Random;
/**
 * This program is the Birthday Problem.
 *
 * Dillon Groh
 */
public class Birthday
{
   public static double calculateProbability(int n, int iterations) {
        //Initializes variables and creates a random number generator
        Random rand = new Random();
        int win = 0;
        
        //Program crashes if the input is not within the bounds
        //Was not sure if this was needed, but decided to add it in because the game can't run accurately if any of these inputs happen.
        if (n < 2 || n > 365) {
            throw new IllegalArgumentException("Error, please enter a number between 2 and 365");
        }

        //These nested for loops create and assign birthdays (random int) to each n (person) in the problem
        for (int i = 0; i < iterations; i++) {
            int[] birthdays = new int[n];
            //Had trouble with this and found this source https://math.hws.edu/javanotes/c3/s4.html and in Example 3.4.2 it explains where you would put the count to reset it
            int count = 0;
            
            for (int j = 0; j < n; j++) {
                birthdays[j] = rand.nextInt(365) + 1;
            }
            
            //These for loops runs a number through every number in the ArrayList to see if there is a match. If they do the game adds one to the count and breaks the game.
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (birthdays[j] == birthdays[k]) {
                        count++;
                        break;
                    }
                }
            }
            
            //This if loop adds a win if the count increased and won during that game. This allows the count to reset at the beginning of each iteration, while keeping the total number of wins safe.
            if (count > 0) {
                win++;
            }
        }
        //Returns the probability to the tester
        double probability = (double) win / iterations;
        return probability * 100;
    }
}
