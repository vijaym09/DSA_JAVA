
import java.util.*;

public class FindTarget {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        List<Integer> result = targetIndices(nums, target);

        System.out.println(result);
    }
}
