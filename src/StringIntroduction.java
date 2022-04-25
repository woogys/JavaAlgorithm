import java.io.*;
import java.util.*;

public class StringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        // 첫번째 줄에는 각 A,B의 길이를 구해서 더해준 값을 프린트
        if (A.compareTo(B) > 1){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        } // 두번째 줄에는 A,B 비교해서 A가 B보다 사전순으로 빠르면 YES 아니면 No
         System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
    } // A를 0번째부터 1번째까지 잘라서 대문자로 만들고, e다시 A를 첫번째부터 A길이만큼 잘라서 붙여준다. 그리고 ""으로 AB 사이에 공백을 넣어준 다음 B도 마찬가지로 첫글자만 대문자처리 해준다.
}