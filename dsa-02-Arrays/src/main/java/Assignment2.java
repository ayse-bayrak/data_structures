import java.util.ArrayList;

public class Assignment2 {
    public static void main(String[] args) {
            ArrayList<int[]> list = new ArrayList<int[]>();
            list.add(new int[] {10,0});
            list.add(new int[] {3,5});
            list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int numberOfPassenger = 0;
        for (int[] stop : stops) {
            numberOfPassenger = numberOfPassenger + stop[0] -stop[1];
        }
        return numberOfPassenger;
    }
}
// complexity O(n)



