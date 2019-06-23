import java.util.ArrayList;
public class recursion{
	public static void main(String[] args) {
        System.out.println("sqrt()");
        System.out.println("-----------------------\n");

        System.out.println("sqrt(4, 0.00001)");
        System.out.println("EXPECTED: 2");
        System.out.println(sqrt(4, 0.00001));         // 2

        System.out.println("----");

        System.out.println("sqrt(8, 0.00001)");
        System.out.println("EXPECTED: ~2.8284");
        System.out.println(sqrt(8, 0.00001));         // ~2.8284

        System.out.println("----");

        System.out.println("sqrt(0, 0.00001)");
        System.out.println("EXPECTED: 0");
        System.out.println(sqrt(0, 0.00001));         // 0

        System.out.println("\n");

        System.out.println("fib()");
        System.out.println("-----------------------\n");

        System.out.println("fib(0)");
        System.out.println("EXPECTED: 0");
        System.out.println(fib(0));                   // 0

        System.out.println("----");

        System.out.println("fib(1)");
        System.out.println("EXPECTED: 1");
        System.out.println(fib(1));                   // 1

        System.out.println("----");

        System.out.println("fib(7)");
        System.out.println("EXPECTED: 13");
        System.out.println(fib(7));                   // 13

        System.out.println("makeAllSums()");
        System.out.println("-----------------------\n");

        System.out.println("makeAllSums(0)");
        System.out.println("EXPECTED: [0]");
        System.out.println(makeAllSums(0));           // [0]

        System.out.println("----");

        System.out.println("makeAllSums(1)");
        System.out.println("EXPECTED: [1, 0]");
        System.out.println(makeAllSums(1));           // [1, 0]

        System.out.println("----");

        System.out.println("makeAllSums(3)");
        System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
        System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]
}
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
        if (n == 0) {
			return 0.0;
		}
		double guess = n / 2;
		return sqrth(n,tolerance,guess);

    }
    public static double sqrth(double n, double tol, double guess) {
      if (Math.abs(Math.pow(guess, 2) - n) / n > tol){
        return sqrth(n, tol, (n / guess + guess) / 2);
      }
      return guess;
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
    public static ArrayList<Integer> makeAllSums(int n){
		ArrayList<Integer> ans = new ArrayList<>();
		helpermAS(ans, n, 0);
		return ans;
    }
	
	public static boolean helpermAS(ArrayList<Integer> ans, int n, int counter) {
		if (n == 0) {
			if (! ans.contains(counter)) {
				return ans.add(counter);
			}
			return true;
		}
		return helpermAS(ans, n - 1, counter + n) && helpermAS(ans, n - 1, counter);
	}
			

}
