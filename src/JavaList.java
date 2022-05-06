import java.io.*;
import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList();
            for (int i=0; i<n; i++){
                list.add(sc.nextInt());
            }

            int q = sc.nextInt();
            for (int i=0; i<q; i++){
                String query = sc.next();
                if (query.equals("Insert")){
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    list.add(x, y);
                    continue;
                }
                if (query.equals("Delete")){
                    int x = sc.nextInt();
                    list.remove(x);
                    continue;
                }
            }
            sc.close();
            System.out.println(list.toString().replaceAll("[^0-9 ]",""));
        }
    }

//Sample Input
//5
// 12 0 1 78 12
// 2
// Insert
// 5 23
// Delete
// 0

//Sample Output
//0 1 78 12 23