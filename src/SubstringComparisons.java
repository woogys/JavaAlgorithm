import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String lex = s.substring(0, k);
        smallest = largest = lex;  // wel
//                                5       2
        for (int i=1; i<= (s.length() - k); i++){ //int는                    // i<=(s.length())
            lex = s.substring(i,(i+k)); // abcde  (1,3) bc (2,4) cd (3,5) de  // s.substring(i, i+k) (1,3) bc (2,4)cd (3,5) de (4,6) e?
            if (lex.compareTo(smallest)<0){  //   (1,4) bcd (2,5) cde // (1,4) bcd (2,5) cde (3,6) de?
                smallest = lex;
            }
            if (lex.compareTo(largest)>0){
                largest = lex;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}