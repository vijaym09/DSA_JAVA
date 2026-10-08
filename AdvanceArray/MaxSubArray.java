public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // Add current element, update
            sum = sum + nums[i];

            // Update maximum sum, take max
            maxi = Math.max(maxi, sum);

            // If sum becomes negative, reset it to zero
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}