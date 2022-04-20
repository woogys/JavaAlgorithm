import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {

 static int B; // static으로 B,H를 입력 받는다.
 static int H;
 static boolean flag = true; //flag 변수를 true로 선언
 
 static {   
     Scanner sc = new Scanner(System.in); 
     B = sc.nextInt();
     H = sc.nextInt();
     
     if((B<=0 || H<=0)) {
         flag = false; // B나 H가 0보다 작으면 false를 내주고 아래 문구를 프린트한다. 
         System.out.println("java.lang.Exception: Breadth and height must be positive");
     }
 }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class 