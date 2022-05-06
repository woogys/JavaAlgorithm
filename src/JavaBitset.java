import java.io.*;
import java.util.*;

public class JavaBitset {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet[] bitset = new BitSet[2];
        bitset[0] = new BitSet(n);
        bitset[1] = new BitSet(n);

        for(int i=0; i<m; i++) {
            String operation = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch( operation ) {
                case "AND":
                    bitset[x-1].and(bitset[y-1]);
                    break;
                case "OR":
                    bitset[x-1].or(bitset[y-1]);
                    break;
                case "XOR":
                    bitset[x-1].xor(bitset[y-1]);
                    break;
                case "FLIP":
                    bitset[x-1].flip(y);
                    break;
                case "SET":
                    bitset[x-1].set(y);
                    break;
            }
            System.out.println( bitset[0].cardinality()+" "+bitset[1].cardinality() );
        }
    }
}

//Sample Input
//5 4
// AND 1 2
// SET 1 4
// FLIP 2 2
// OR 2 1

//Sample Output
//0 0
// 1 0
// 1 1
// 1 2