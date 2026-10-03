public class LargestElement {

    public static int findLargest(int[] nums) {

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] nums = {4, 7, 2, 9, 1};

        System.out.println(findLargest(nums));
    }
}