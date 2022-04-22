import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment); 
        //통화 수치 객체 생성 예시를 따라 작성한다.
        Locale indiaCustomLocale = new Locale("en", "IN"); 
        // 문제에서 인도는 제공되는 기본 Locale이 없어 직접 constuct 해주라고 되어 있다.
        String india = NumberFormat.getCurrencyInstance(indiaCustomLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}