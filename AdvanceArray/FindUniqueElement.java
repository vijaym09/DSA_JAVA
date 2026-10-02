public class FindUniqueElement {

    public static int findUniqueElement(int[] nums) {
        int xorSum = 0;

        for (int n : nums) {
            xorSum = xorSum ^ n;
        }

        return xorSum;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 5, 4, 5, 3, 2};

        int result = findUniqueElement(nums);

        System.out.println("Unique element: " + result);
    }
}