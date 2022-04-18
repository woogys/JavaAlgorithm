import java.io.*;
import java.util.*;
public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); // 새 스캐너 객체를 생성해 입력받는 값(문장)을 받는다.
        int i = 1; // 첫번째 줄에서 1부터 넘버링이 시작된다.
        while(sc.hasNext()){ // hasNext로 입력값이 들어오는지 여부를 판단해 들어오는 경우를 while문의 조건으로 준다.
            System.out.println(i + " " + sc.nextLine()); //문장 앞의 숫자 + 공백 + 입력받은 문자열 전체를 리턴하기 위한 nextLine()함수를 프린트해준다.
            i ++; // i는 하나씩 증가해 나간다.
        }
    }
}
