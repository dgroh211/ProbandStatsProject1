import java.util.ArrayList;
/**
 * This is the program to test the SetOperations class.
 *
 * Dillon Groh
 */
public class TestSetOperations
{
    public static void main(String[] args){

        ArrayList<String> daysS = new ArrayList<>();
        ArrayList<String> daysA = new ArrayList<>();
        ArrayList<String> daysB = new ArrayList<>();
        ArrayList<Integer> integersS = new ArrayList<>();
        ArrayList<Integer> integersA = new ArrayList<>();
        ArrayList<Integer> integersB = new ArrayList<>();
        
        //add element to daysS
        daysS.add("Monday");
        daysS.add("Tuesday");
        daysS.add("Wednesday");
        daysS.add("Thursday");
        daysS.add("Friday");
        daysS.add("Saturday");
        daysS.add("Sunday");
        
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
        integersS.add(1);
        integersS.add(2);
        integersS.add(3);
        integersS.add(4);
        integersS.add(5);
        integersS.add(6);
        integersS.add(7);
        integersS.add(8);
        integersS.add(9);
        integersS.add(10);
        
        //add elements to integersA
        integersB.add(2);
        integersB.add(4);
        integersB.add(5);
        integersB.add(6);
        integersB.add(9);
        
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
        System.out.println("The complement of daysA is: " + solution.complementString(daysA, daysB));
        System.out.println("The complement of daysB is: " + solution.complementString(daysB, daysA));
        System.out.println("The complement of integersA is: " + solution.complementInt(integersA, integersS));
        System.out.println("The complement of integersB is: " + solution.complementInt(integersB, integersS));
    }
}
