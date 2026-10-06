import java.util.HashMap;

public class Main {

    public static int findFirstRepeatingElement(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Store frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find the first element whose frequency is greater than 1
        for (int i : arr) {
            if (freq.get(i) > 1) {
                return i;
            }
        }

        // If no repeating element exists
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int result = findFirstRepeatingElement(arr);

        System.out.println("First repeating element: " + result);
    }
}