
public class SortPermutation {
    public static int sortPermutation(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                k |= nums[i];
            }
        }

        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                ans &= nums[i];
                ans &= i;
            }
        }

        return ans == -1 ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 2, 1};

        int result = sortPermutation(nums);

        System.out.println(result);
    }
}
