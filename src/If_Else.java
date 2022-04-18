import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 == 0){ //n이 짝수인 경우
            if(N >= 2 && N <=5){ // 2보다 크고 5보다 작은 경우 
                System.out.println("Not Weird");
            }
            else if(N >=6 && N <=20){ // 6보다 크고 20보다 작은 경우 
                System.out.println("Weird");
            }
            else if(N >=20){ // 20보다 큰 경우
                System.out.println("Not Weird");
            }
        }
        else { //n이 홀수인 경우
            System.out.println("Weird");
        }
        scanner.close();
    }
}