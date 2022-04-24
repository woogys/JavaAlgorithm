import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
        // 첫번째 줄에는 S를 나타내는 단일 문자열, 
        // 두번째 줄에는 start, end 포인트를 나타내는 정수가 Input된다.
        // 시작에서 끝-1까지 포함하는 범위의 문자열을 프린트해야 한다.
        // substring(a,b)는 a번째부터 b번째 전까지 잘라서 프린트해주므로 활용한다.
    }
}