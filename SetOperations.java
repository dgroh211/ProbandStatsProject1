import java.util.ArrayList;
/**
 * This is the program that contains all the SetOperations.
 *
 * Dillon Groh
 */
public class SetOperations
{
    public static ArrayList<Integer> unionInt(ArrayList<Integer> a, ArrayList<Integer> b) {
        //Initializes the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        //Adds every element of a to the ArrayList so there are no duplicates
        list.addAll(a);
        
        //For loop to check whether the element is already contained in the ArrayList
        for (int singleElement : b) {
            //If the element is not in the ArrayList then it gets added
            //https://www.tutorialspoint.com/check-if-a-java-arraylist-contains-a-given-item-or-not#:~:text=ArrayList.,the%20item%20is%20not%20present. This helped with the .contains method and every other method
            if(!list.contains(singleElement)) {
                list.add(singleElement);
            }
        }
        
        //Returns the union
        return list;
    }
    
    public static ArrayList<Integer> intersectionInt(ArrayList<Integer> a, ArrayList<Integer> b) {
        //Initializes the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        //Runs the for loop through each element of a then passes it to b
        for (int singleElement : a) {
            //The if loop checks that if the element from a matches b, if so then it is added to the ArrayList
            if (b.contains(singleElement)) {
                list.add(singleElement);
            }
        }
        
        //Returns the intersection
        return list;
    }
    
    public static ArrayList<Integer> complementInt(ArrayList<Integer> a, ArrayList<Integer> b) {
        //Initializes the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        //Runs the for loop each element of b and passes it to a to see if a contains that element
        for (int singleElement : b) {
            //If a does not contain that element then it is added to the ArrayList
            if (!a.contains(singleElement)) {
                list.add(singleElement);
            }
        }
        
        //Returns the complement
        return list;
    }
    
    public static ArrayList<String> unionString(ArrayList<String> a, ArrayList<String> b) {
        //Initializes the ArrayList
        ArrayList<String> list = new ArrayList<>();

        //Adds every element of a to the ArrayList so there are no duplicates
        list.addAll(a);
        
        //For loop to check whether the element is already contained in the ArrayList        
        for (String singleElement : b) {
            //If the element is not in the ArrayList then it gets added            
            if(!list.contains(singleElement)) {
                list.add(singleElement);
            }
        }
        
        //Returns the union
        return list;
    }
    
    public static ArrayList<String> intersectionString(ArrayList<String> a, ArrayList<String> b) {
        //Initializes the ArrayList
        ArrayList<String> list = new ArrayList<>();
        
        //Runs the for loop through each element of a then passes it to b        
        for (String singleElement : a) {
            //The if loop checks that if the element from a matches b, if so then it is added to the ArrayList            
            if (b.contains(singleElement)) {
                list.add(singleElement);
            }
        }
        
        //Returns the intersection
        return list;
    }
    
    public static ArrayList<String> complementString(ArrayList<String> a, ArrayList<String> b) {
        //Initializes the ArrayList
        ArrayList<String> list = new ArrayList<>();
       
        //Runs the for loop each element of b and passes it to a to see if a contains that element
        for (String singleElement : b) {
            //If a does not contain that element then it is added to the ArrayList            
            if (!a.contains(singleElement)) {
                list.add(singleElement);
            }
        }
        
        //Returns the complement
        return list;
    }
}
