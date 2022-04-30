import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        BigInteger int1 = new BigInteger(sc.nextLine());
        BigInteger int2 = new BigInteger(sc.nextLine());

        System.out.println(int1.add(int2));
        System.out.println(int1.multiply(int2));
    }
}