import java.util.*;
import java.io.*;

public class LoopII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a; // 쿼리 수를 나타내는 정수 a를 result로 받는다.

            for(int j=0; j<n; j++){
                result += Math.pow(2,j) * b; // a로 받은 result 값에 2의 j제곱 x b의 형태로 나타내야 한다.
                //이때 n-1까지만 나타내면 되므로 j<n의 제약을 주어 하나씩 증가시킨다.
                System.out.printf("%d ", result); // 그간 풀어왔던 문제들과 마찬가지로 result값을 integer를 출력할 수 있는 %d에 담아 프린트해주면 된다.
                //처음에 %d 뒤에 공백을 넣어주지 않아 오류가 났는데, 문제에서 n개의 공백으로 분리된 형태로 출력하라고 했으므로
                //""안에 공백까지 포함하여 넣어주어야 한다.
            }
            System.out.printf("%n"); // 각 쿼리는 single line에 맞춰 출력되어야 하므로 개행처리를 해준다.
        }
        in.close();
    }
}