import java.util.*;

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {

        for (int i=0;i<nums.length;i++) {

            int value=Math.abs(nums[i]);
            int position=value-1;

            // If already negative, this number is duplicate
            if (nums[position]<0) {
                return value;
            }

            // Mark as visited
            nums[position] = -nums[position];
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        int result = findDuplicate(nums);

        System.out.println("Duplicate number: " + result);
    }
}