import java.util.ArrayList;

public class OtherMethods{

    public void sayHi() {
        System.out.println("hi name");
    }

    public void sayHi(String someName) {
        System.out.println("hi " + someName);
    }

    public ArrayList<Integer> multiplyBy100(ArrayList<Integer> nums) {
        for(int i = 0; i< nums.size(); i++) {
            // System.out.println(nums.get(i) * 100);
            nums.set(i, nums.get(i) * 100);
        }
        System.out.println(nums);
        return nums;

    }
}