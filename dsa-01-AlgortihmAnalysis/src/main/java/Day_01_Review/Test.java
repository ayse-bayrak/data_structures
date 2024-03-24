package Day_01_Review;

public class Test {
    public static void main(String[] args) {
       // new X(1) it is an object without reference
      X b=new X(1); // referencing to this new object, I have stored the address of X on b.
      //b is holding address of X(1)

        System.out.println(b);//Day_01_Review.X@2f92e0f4
        //if I have a variable from a class it holds address or reference from that class type

        int[] scoreArray=new int[10];
        System.out.println(scoreArray); //[I@28a418fc  // it will type the beginning of the address
        // This is the address of index ) in java programming language

    }
}
