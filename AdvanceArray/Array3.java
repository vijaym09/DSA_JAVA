
import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {

        int[] nums = {1, 10, 2, 9};

        Arrays.sort(nums);

        int median = nums[nums.length / 2];

        int moves = 0;

        for (int i = 0; i < nums.length; i++) {
            moves += Math.abs(nums[i] - median);
        }

        System.out.println("Minimum moves: " + moves);
    }
}
