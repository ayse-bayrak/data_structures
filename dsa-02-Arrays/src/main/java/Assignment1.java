import java.util.Arrays;

public class Assignment1 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(twoSum(array, 9));
    }
    public static int[] twoSum(int[] array, int target) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] ==target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
// complexity O(n2)