import java.util.ArrayList;

public class Tester {

    public static void main(String[] bobs){

        OtherMethods whatever = new OtherMethods();
        whatever.sayHi();
        whatever.sayHi("bob");

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(11);
        nums.add(22);
        nums.add(33);
        nums.add(44);

        // whatever.multiplyBy100(nums);
        System.out.println(" aa " + whatever.multiplyBy100(nums)); // ?


    }
}