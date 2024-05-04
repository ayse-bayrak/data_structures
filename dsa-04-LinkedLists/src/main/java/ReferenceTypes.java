public class ReferenceTypes {
    public static void main(String[] args) {

        User user1 = new User("James");
        System.out.println(new User("James")); //User@2f92e0f4
        System.out.println(user1); //User@28a418fc address of user1 object

        // This means that the user1 variable, in fact is a just a holder of the address of this object.
        // so new User("James") this structure returns the address of this object

        // briefly this(user1) is just a reference type the variables created from a class type

        // it is also similar with array
        int[] array = new int[5];
        System.out.println(array); //[I@28a418fc

        // it is also similar with interfaces and other classes as well
        // that's how we can make injection into classes with interfaces and other classes as well.


    }
}
