import java.util.Scanner;
public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner의 객체 생성 System.in으로 입력값을 바이트 단위로 읽음
        System.out.println("================================");
        for(int i=0;i<3;i++) // for문을 이용한 반복문. i 변수를 0으로 초기화 하고, 3보다 작을때까지, i가 하나씩 증가하며 조건 만족시까지 반복
        {
            String s1=sc.next(); // next();로 공백 이전까지의 문자열을 입력받음
            int x=sc.nextInt(); // nextInt();로 정수 입력 받음
            System.out.printf("%-15s%03d%n", s1, x);
            // %-15s: String을 출력하되, 입력 숫자(15)만큼의 공간을 할당한다. 양수는 문자열이 오른쪽 정렬되고 음수는 왼쪽 정렬된다.
            // %03d: 정수(%d)를 표현하되, 총 3자리로 나타내고, 앞 빈자리는 0으로 채운다.
            // %n: 개행한다.
        }
        System.out.println("================================");

    }
}
