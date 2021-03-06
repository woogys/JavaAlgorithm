import java.util.*;
import java.io.*;

public class JavaMap {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i=0;i<n;i++){
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String name=in.nextLine();
            if(!phoneBook.containsKey(name)){
                System.out.println("Not Found");
                continue;
            }
            System.out.println(name + "=" + phoneBook.get(name));
        }
    }
}




// Sample Input
// 3
// uncle sam
// 99912222
// tom
// 11122222
// harry
// 12299933
// uncle sam
// uncle tom
// harry

//Sample Output
//uncle sam=99912222
// Not found
// harry=12299933