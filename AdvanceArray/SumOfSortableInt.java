
import java.util.Arrays;

public class SumOfSortableInt {

    public static int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean valid = true;

            for (int start = 0; start < n; start += k) {
                if (!isRotation(nums, sorted, start, k)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans += k;
            }
        }

        return ans;
    }

    private static boolean isRotation(
            int[] nums, int[] sorted, int start, int k) {

        for (int shift = 0; shift < k; shift++) {
            boolean match = true;

            for (int j = 0; j < k; j++) {
                if (nums[start + (shift + j) % k]
                        != sorted[start + j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2};

        int result = sortableIntegers(nums);

        System.out.println("Output: " + result);
    }
}
