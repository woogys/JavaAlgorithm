import java.util.*;
import java.io.*;

public class Datatypes {
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                // 예시가 있어서 힌트를 얻기 쉬웠던 것 같다. 실수형 범위를 지정해 주고 출력할 문자를 적어준다.
                if(x>=Math.pow(-2, 31) && x<=Math.pow(2,31)-1)System.out.println("* int");
                // int와 long 부터는 자리값이 너무 커져서 숫자를 전부 다 적어주는 것은 비효율적인 것 같다.
                if(x>=Math.pow(-2, 63) && x<=Math.pow(2,63)-1)System.out.println("* long");
            }
            // 4바이트인 int는 총 32비트이므로 -2^31~2^31-1
            // 8바이트인 long은 총 64비트이므로 -2^63~2^63-1로 범위를 나타낼 수 있다.
            //Loop II에서 배운 Math.pow를 통해 범위를 나타내 주었다.
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

