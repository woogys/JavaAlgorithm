import java.util.*; //스캐너 사용을 위해 호출해 주는 부분이다. util 다음에 scanner라고 써줘도 되지만, 전체를 불러오는 *가 HackerRank의 default인 듯 하다.

public class StdinandStdoutI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 입력을 위해 스캐너 객체를 생성해 준다. 클래스이름 객체이름 = new 클래스이름();의 형태.
        // 이때, ()안에는 사용자로부터 입력을 받기 위한 입력 스트림인 System.in이 들어간다.
        int a = scan.nextInt(); // 문제에서 각각 정수형 a,b,c를 입력받으므로
        int b = scan.nextInt(); //int형 입력 및 리턴을 해준다.
        int c = scan.nextInt();

        System.out.println(a); // 입력이 끝나면 Scanner 개체를 닫고
        System.out.println(b); // System.out.println(String)을 사용해
        System.out.println(c); // stdout에 출력한다.
    }
}