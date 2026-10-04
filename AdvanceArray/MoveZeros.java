public class MoveZeros {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        int index = 0;

        // Put all non-zero elements at the beginning
        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }

        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

        // Print the array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}