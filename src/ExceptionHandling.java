import java.util.Scanner;
class MyCalculator1 {
    /*
     * Create the method long power(int, int) here.
     */
    public static long power(int n, int p) throws Exception {
        if( n<0 || p<0 ) {
            throw new Exception("n or p should not be negative.");
        } else if ( n==0 && p==0 ) {
            throw new Exception("n and p should not be zero.");
        }
        return (int) Math.pow(n,p); //Math.pow(x,y)는 반환 디폴트가 double이어서 int로 cast 해줌
    }
}

public class ExceptionHandling {
    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
