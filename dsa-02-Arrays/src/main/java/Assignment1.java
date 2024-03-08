import java.util.Arrays;

public class Assignment1 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array1 = {2,7,11,15};

        System.out.println(twoSum(array));
        int[] result = twoSumWithArray(array1);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSumWithArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] + array[j] ==9) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static String twoSum(int[] array) {
        for (int i = 0; i < array.length ; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] + array[j] ==9) {
                    return "["+ i + "-" + j + "]";
                }
            }
        }
        return "[ ]";
    }
}
// complexity O(n2)