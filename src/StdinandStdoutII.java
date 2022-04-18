import java.util.Scanner;

public class StdinandStdoutII {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();

    double d = scan.nextDouble();
    scan.nextLine(); // 이 부분을 추가하여 버퍼에 남은 개행문자를 처리해 준다.
    String s = scan.nextLine();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
}
}