public class FindPivot {

    public static int pivotIndex(int[] nums) {

        int n = nums.length;

        int[] leftSum =new int[n];
        int[] rightSum=new int[n];

        // Fill the left sum first
        leftSum[0]=nums[0];

        for (int i=1;i<n;i++) {
            leftSum[i]=leftSum[i-1]+nums[i];
        }

        // Fill the right sum first
        rightSum[n-1]=nums[n-1];

        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i];
        }

        // Check for equality
        for (int i=0;i<n;i++) {
            if (leftSum[i]==rightSum[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        int result = pivotIndex(nums);

        System.out.println("Pivot Index: " + result);
    }
}