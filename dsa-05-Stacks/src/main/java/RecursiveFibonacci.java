public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    public static int fib(int n) {
        if(n==0) return 0; // termination or base condition
        if(n==1) return 1; // termination or base condition
        return fib(n-1)+fib(n-2);
    }
}
