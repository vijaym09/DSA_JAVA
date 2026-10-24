
public class ArrayProblem {

    public static int countDaysTogether(String arriveAlice, String leaveAlice,
                                        String arriveBob, String leaveBob) {

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        String[] dates = {
            arriveAlice, leaveAlice, arriveBob, leaveBob
        };

        int[] date = new int[4];

        for (int i = 0; i < 4; i++) {
            int month = Integer.parseInt(dates[i].substring(0, 2));
            int day = Integer.parseInt(dates[i].substring(3, 5));

            int total = day;

            for (int j = 0; j < month - 1; j++) {
                total += days[j];
            }

            date[i] = total;
        }

        int start = Math.max(date[0], date[2]);
        int end = Math.min(date[1], date[3]);

        return Math.max(0, end - start + 1);
    }

    public static void main(String[] args) {

        System.out.println(countDaysTogether(
            "08-15", "08-18", "08-16", "08-19"
        ));

        System.out.println(countDaysTogether(
            "10-01", "10-31", "11-01", "12-31"
        ));
    }
}
