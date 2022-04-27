import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String aa = a.toLowerCase();
        String bb = b.toLowerCase();

        char[] aaa = aa.toCharArray();
        char[] bbb = bb.toCharArray();

        java.util.Arrays.sort(aaa);
        java.util.Arrays.sort(bbb);

        return java.util.Arrays.equals(aaa,bbb);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}