public class recursion {
    public static void main(String[] args) {


        recursionFunction(10) ;


    }


    public static double recursionFunction(int n) {
        int firstnumber = 0;
        int secondnumber = 1;
        int nextTerm = 0;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {

            System.out.print(firstnumber + ", ");

            // compute the next term
            nextTerm = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = nextTerm;
        }
        return nextTerm;
    }


}