import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment1_TwoSumOptimal {
    public static void main(String[] args) {
        int[] array=new int[]{3,2,7,9,11};
        System.out.println(Arrays.toString(findO2nSolution(array, 9)));
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 9)));


    }
// my extra solution
    public static int[] findO2nSolution(int[] array, int target) {
        // Complexity O(2n) ==> O(n)

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],i );
        }

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(target-array[i])) {
                return new int[ ] {i, map.get(target-array[i])};
            }
        }
        return new int[]{};
    }


    public static int[] twoSumOptimalSolution(int[] array, int targetValue){
        // Complexity of the solution is O(n) but I have space complexity of O(n)
      // because we create hashmap
        Map<Integer,Integer> map=new HashMap<>();// 0 1 2 3

        for (int i = 0; i <array.length ; i++) { //{3,2,7,9,11};
            int potentialMatch=targetValue-array[i]; //i=0==> 9-3 = 6 ... i=1==> 9-2= 7
            if (map.containsKey(potentialMatch))
                return new int[] {i,map.get(potentialMatch)}; // returning matching index i=1 int[] {1, 2 }
           else map.put(array[i], i); // 3, 0
        }
        return new int[]{};
    }
}
