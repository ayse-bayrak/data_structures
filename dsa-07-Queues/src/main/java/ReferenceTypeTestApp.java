public class ReferenceTypeTestApp {
    public static void main(String[] args) {
        //Reference Types in Java
        //1-Class types
        Car a = new Car("Audi", "A4");
        //This Car class is reference Types saves the address of Car object in 'a' value
        System.out.println(a); //Car@2f92e0f4
        System.out.println(new Car("Audi", "A4"));//Car@28a418fc
        //2-Array types
        int[] arr = new int[5];
        System.out.println(arr); //[I@5305068a
        //3-interface types

        //--------------------------------
        Person person1 = new Person("Michale", new Car("Audi", "A4"));
        Person person2 = new Person("MichaleNeext", new Car("BMW", "3 Series"));
        person1.next = person2;
        System.out.println(person1);

        System.out.println(person1.next);//Person@2ff4acd0
        System.out.println(person2);//Person@2ff4acd0

        Person current = person2;
        System.out.println(current);//Person@2ff4acd0

    }
}
