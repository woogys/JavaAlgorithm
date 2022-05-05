import java.util.*;
import java.io.*;

public class JavaMap {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> phoneBook = new HashMap<>();

        for(int i=0;i<n;i++){
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s=in.nextLine();
            if( !phoneBook.containsKey(s)){
                System.out.println("Not Found");
                continue;
            }
            System.out.println(s + "=" + phoneBook.get(s));
        }
    }
}
