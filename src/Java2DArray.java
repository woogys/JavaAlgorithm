import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args)
    {
        int a[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(System.in);)
        {
            for(int i = 0; i < 6; i++)
            {
                for(int j = 0; j < 6; j++)
                {
                    a[i][j] = scanner.nextInt();
                    if (i > 1 && j > 1)
                    {
                        int sum =
                                a[i][j]
                                        + a[i][j-1]
                                        + a[i][j-2]
                                        + a[i-1][j-1]
                                        + a[i-2][j]
                                        + a[i-2][j-1]
                                        + a[i-2][j-2];
                        if (sum > maxSum) {maxSum = sum;}
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}





//public class Java2DArray {
//    public static void main(String[] args) {
//        int[][] arr = new int[2][3];
//        int k = 10;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//
//                arr[i][j] = k; // 인덱스를 이용한 초기화
//
//                k += 10;
//
//            }
//
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//
//                System.out.print(arr[i][j] + " ");
//
//            }
//
//            System.out.println();
//
//        }
//    }
//}