import java.util.Arrays;
import java.util.ArrayList;


public class ArraysTest {

    public static void main(String[] bobs) {

        // --- ARRAYS ----
        // PRIMITIVE

        int[] myArray;
        myArray = new int[5];    // Initialization
        // [0,0,0,0,0]
        String name; // null
        int x; // 0
        double y; // 0.0
        
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;

        System.out.println(Arrays.toString(myArray));

        for(int i = 0; i<myArray.length; i++ ) {
            System.out.println(myArray[i]);
        }

        String[] names = {"bob", "john", "jenny"};
        System.out.println(Arrays.toString(names));

        // ====== DYNAMIC ARRAYS ==========
        ArrayList<String> people = new ArrayList<String>();
        people.add("bob");        
        people.add("Jenny");        
        people.add("Tyler");        
        // people.remove(0);
        System.out.println(people); // ? []
        System.out.println("------ \n -------");

        for(int i = 0; i<people.size() ; i++ ) {
            // System.out.println(people.get(i));
            // String aName = people.get(i);
            // System.out.println(aName + " is awesome");
            people.set(i, people.get(i) + " is awesome");
        }
        System.out.println(people); // ? []

        for(String someName : people) {
            System.out.println("e: " + someName);
        }
    }
}