import java.io.*;
import java.math.BigInteger;

import static java.util.stream.Collectors.joining;


public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        ///
        BigInteger b = new BigInteger(n);
        if (b.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
