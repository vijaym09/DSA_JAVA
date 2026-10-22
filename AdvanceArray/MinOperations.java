
class MinOperations {
    public static int minOperations(int[] nums) {
        int n = nums.length;

        // Check every left rotation of the original array
        for (int k = 0; k < n; k++) {
            boolean sorted = true;

            for (int i = 0; i < n; i++) {
                if (nums[(i + k) % n] != i) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return Math.min(k, n - k + 1);
            }
        }

        // Check every left rotation after reversing
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }

        for (int k = 0; k < n; k++) {
            boolean sorted = true;

            for (int i = 0; i < n; i++) {
                if (reversed[(i + k) % n] != i) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return Math.min(k + 1, n - k);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1};
        System.out.println(minOperations(nums));
    }
}
