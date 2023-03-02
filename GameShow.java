import java.util.Random;
/**
 * This is the program to run the game show where the user chooses a curtain and we test the probability of whether or not they're right
 *
 * Dillon Groh
 */
public class GameShow
{
    public static double probabilityWithoutSwitching (int iterations) {
        //Initializes variable
        int win = 0;
        //Initializes random number generator
        Random rand = new Random();
        
        for (int i = 0; i < iterations; i++) {
            //Give the doors variables. G is the winner
            String[] doors = {"G", "D1", "D2"};

            //Makes user select a random door
            int initialChoice = rand.nextInt(3);

            //Checks to see if the random door given was G. If it is then the user wins, if not then they lose.
            if (doors[initialChoice].equals("G")) {
                win++;
            }
        }

        //Returns the win percentage
        double probability = (double) win / iterations;
        return probability * 100;
    }
    
    public static double probabilityWithSwitching(int iterations) {
        //Initializes win variable
        int win = 0;
        //Initializes random number generator
        Random rand = new Random();

        for (int i = 0; i < iterations; i++) {
            //Give the doors variables. G is the winner
            String[] doors = {"G", "D1", "D2"};

            //Makes user select a random door
            int userDoor = rand.nextInt(3);

            //Originally set the doors to 0, but this was outputting the same result as the door without switching. I changed to -1 after looking online and came across these sites: 
            //https://rollbar.com/blog/how-to-fix-the-array-index-out-of-bounds-excepiton-in-java/ and https://www.geeksforgeeks.org/array-index-out-of-bounds-exception-in-java/ to learn more about how to use an invalid index to my advantage
            //Initialize dudDoor to -1 because this is an invalid index so we know that it goes through when they are assigned valid values. If it was equal to 0 through 2, then this could mess up the array finding the door.
            int dudDoor = -1;
            //Opens one of the dud doors by checking through each door and to see if its not the user's door and a dud. When it does, dudDoor is set to that door's index and that door is then opened.
            for (int j = 0; j < doors.length; j++) {
                if (j != userDoor && doors[j].equals("D1")) {
                dudDoor = j;
                //Breaks so the loop doesn't run anymore
                break;
                }
            }

            //Initialize finalDoor to -1 because this is an invalid index so we know that it goes through when they are assigned valid values. If it was equal to 0 through 2, then this could mess up the array finding the door.
            int finalDoor = -1;
            //Switches the door by running through all the doors and making sure its not the dud door in the previous loop and the user's door. Then that last door is found and set to the finalDoor.
            for (int j = 0; j < doors.length; j++) {
                if (j != userDoor && j != dudDoor) {
                finalDoor = j;
                //Breaks so the loop doesnt run anymore
                break;
                }
            }

            //Checks to see if the final door given was G. If it is then the user wins, if not then they lose and there is no win tallied.
            if (doors[finalDoor].equals("G")) {
                win++;
            }
        }

        //Returns the win percentage
        double probability = (double) win / iterations;
        return probability * 100;
    }
}
