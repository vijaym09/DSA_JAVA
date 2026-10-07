import java.util.*;

public class FindMissingElement {

    public static List<Integer>findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        // Marking
        int n = nums.length;
        for (int index = 0; index < n; index++) {

            int value = Math.abs(nums[index]);
            int position = value - 1;
            // Mark this position
            if (nums[position] > 0) {
                nums[position]=-nums[position];
            }
        }

        // Traverse array
        // Whenever we find a positive value,
        // the number at this index is missing
        for (int i=0;i<n;i++) {
            if (nums[i] > 0) {
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result);
    }
}