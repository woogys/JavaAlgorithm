import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance(); // Calendar 객체를 사용해 month, day, year 세팅
        cal.set(Calendar.MONTH,month-1); // 0부터 1월이 시작되므로 -1 해줌
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
        
        String[] DAY_OF_WEEK = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"}; 
        // 배열로 요일을 생성한다. 이때, 얻어오는 요일 값은 0=일 1=월 2=화 ~ 6=토
        
        return DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)-1];
        // cal.get(Calendar.DAY_OF_WEEK)으로 얻어오는 값은 
        // 1=일 2=월 ~ 7=토 이므로 -1을 해준다. (배열[]은 0부터 시작, 얻어온 요일 값은 1부터 시작)

    }

}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}