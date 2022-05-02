import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String reverse ="";
        for (int i = A.length() -1; i>=0; i--){
            reverse = reverse + A.charAt(i);
        }

        System.out.println(reverse);

        if (A.equals(reverse)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

//        StringBuffer sb = new StringBuffer(A);
//
//        if  (A.equals(sb.reverse().toString())) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

    }
}