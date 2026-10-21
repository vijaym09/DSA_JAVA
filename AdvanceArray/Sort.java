public class Sort{

    public static int minOperations(String s) {
        int n = s.length();

        // Already sorted
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        //Condition for sorted 
        if (sorted) {
            return 0;
        }

        // Check whether all characters are the same
        boolean allSame = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(0)) {
                allSame = false;
                break;
            }
        }

        if (allSame) {
            return 0;
        }

        // Count distinct characters
        boolean[] seen = new boolean[26];
        int distinct = 0;

        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';

            if (!seen[index]) {
                seen[index] = true;
                distinct++;
            }
        }

        // For a string of length 2, sorting a proper
        // substring cannot change the string.
        if (n == 2) {
            return -1;
        }

        // If the smallest character is at the end
        // or the largest character is at the beginning
        char first = s.charAt(0);
        char last = s.charAt(n - 1);

        char minChar = s.charAt(0);
        char maxChar = s.charAt(0);

        for (int i = 1; i < n; i++) {
            minChar = (char) Math.min(minChar, s.charAt(i));
            maxChar = (char) Math.max(maxChar, s.charAt(i));
        }

        if (first == minChar && last == maxChar) {
            return 1;
        }

        if (first == minChar || last == maxChar) {
            return 2;
        }

        if (first == maxChar && last == minChar) {
            return 3;
        }

        return 2;
    }

    public static void main(String[] args) {
        String s = "dog";

        System.out.println(minOperations(s));
    }
}