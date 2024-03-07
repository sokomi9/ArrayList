import java.util.ArrayList;
import java.util.List;

/**
 * index
 */
public class index {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(30);
        nums.add(50);
        nums.add(90);

        System.out.println("The index of 10 is : " + nums.indexOf(10));
        System.out.println("The value of index 2 is : " + nums.get(2));

        System.out.println("Number of Students");
        for(int n : nums){
            System.out.println(n);
        }
    }
}