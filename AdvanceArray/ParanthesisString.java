
public class ParanthesisString {

    public static int minInsertions(String s) {
        int insertions = 0;
        int need = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                need += 2;

                // Ensure the required closing pair stays together
                if (need % 2 != 0) {
                    insertions++;
                    need--;
                }

            } else {
                need--;

                if (need < 0) {
                    insertions++;
                    need = 1;
                }
            }
        }

        return insertions + need;
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("(()))"));  // 1
        System.out.println(minInsertions("())"));    // 0
        System.out.println(minInsertions("))())("));  // 3
    }
}