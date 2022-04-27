import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // s를 trim()해주고, 그 길이가 문제에서 주어진 범위 안에 있다면
        if (s.trim().length() >= 1 || s.trim().length() >= 400000) {
            //split()을 사용해 구분자를 바탕으로 문자열을 배열형식으로 정규식(regex)에 맞춰서 분할하고 token이라는 변수명으로 담아준다.
            String[] token = s.trim().split("[ !,?._'@]+");
            // 첫줄에는 token의 길이를 출력한다.
            System.out.println(token.length);
            //i 초기값 0부터 irk 토큰의 길이보다 작을때까지 증가시키며 반복
            for (int i = 0; i < token.length; i++) {
                //토큰의 배열을 출력해준다.
                System.out.println(token[i]);
            }
        } else {
            System.out.println("0");
        }
        scan.close();
    }
}