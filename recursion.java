import java.util.ArrayList
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
        return sqrth(n, tolerance, 1);

    }
    public static double sqrth(double n, double tol, double guess) {
      if (Math.abs(guess - n) / n <= tol){
        return guess;
      }
      return sqrth(n, tol, (n / guess + guess) / 2);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      if (n == 0) {
        return 0;
      }
      if (n < 2) {
        return 1;
      }
      return fib(n-1) + fib(n-2);
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
    }

}
