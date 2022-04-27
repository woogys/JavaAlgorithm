import java.util.Scanner;

public class StringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String lex = s.substring(0, k);
        smallest = largest = lex;

        for (int i=1; i<= (s.length() - k); i++){
            lex = s.substring(i,(i+k));
            if (lex.compareTo(smallest)<0){
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