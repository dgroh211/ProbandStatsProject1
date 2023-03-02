import java.util.Scanner;
import java.util.Random;

/**
 * This program is used to test the Birthday Problem.
 *
 * Dillon Groh
 */
public class TestBirthday
{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        //Call the Birthday class
        Birthday solution = new Birthday();
        
        // User inputs how many people they want to test
        System.out.print("Enter the number of people greater than 2 and less than 365: ");
        int n = input.nextInt();

        // User inputs how many iterations of the program they would like to run
        System.out.print("Enter the number of iterations: ");
        int iterations = input.nextInt();
             
        System.out.println("The probability of two people sharing a birthday is: " + solution.calculateProbability(n, iterations) + "%");
    }
}
