import java.util.ArrayList;
/**
 * This is the program to test the SetOperations class.
 *
 * Dillon Groh
 */
public class TestSetOperations
{
    public static void main(String[] args){

        ArrayList<String> daysA = new ArrayList<>();
        ArrayList<String> daysB = new ArrayList<>();
        ArrayList<Integer> integersA = new ArrayList<>();
        ArrayList<Integer> integersB = new ArrayList<>();
        
        //add elements to daysA
        daysA.add("Monday");
        daysA.add("Wednesday");
        daysA.add("Thursday");
        daysA.add("Sunday");
        
        //add elements to daysB 
        daysB.add("Monday");
        daysB.add("Tuesday");
        daysB.add("Wednesday");
        daysB.add("Thursday");
        
        //add elements to integersS
        integersA.add(1);
        integersA.add(2);
        integersA.add(3);
        integersA.add(4);
        integersA.add(5);
        integersA.add(6);
        integersA.add(7);
        integersA.add(8);
        integersA.add(9);
        integersA.add(10);
        
        //add elements to integersB
        integersB.add(1);
        integersB.add(2);
        integersB.add(5);
        integersB.add(7);
        integersB.add(9);
        
        SetOperations solution = new SetOperations();
        
        System.out.println("The union of daysA and daysB is: " + solution.unionString(daysA, daysB));
        System.out.println("The union of integersA and integersB is: " + solution.unionInt(integersA, integersB));
        System.out.println("The intersection of daysA and daysB is: " + solution.intersectionString(daysA, daysB));
        System.out.println("The intersection of integersA and integersB is: " + solution.intersectionInt(integersA, integersB));
        System.out.println("The complement of daysA to daysB is: " + solution.complementString(daysA, daysB));
        System.out.println("The complement of daysB to daysA is: " + solution.complementString(daysB, daysA));
        System.out.println("The complement of integersA to integersB is: " + solution.complementInt(integersA, integersB));
        System.out.println("The complement of integersB to integersA is: " + solution.complementInt(integersB, integersA));
    }
}
