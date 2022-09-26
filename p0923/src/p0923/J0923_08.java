package p0923;

import java.util.Scanner;

public class J0923_08 {

	public static void main(String[] args) {
		// 입력받기 위한 선언
		Scanner scan = new Scanner(System.in);
		System.out.println("1숫자를 입력하세요.");
		String str1 = scan.nextLine(); //문자열로 입력받음 + enter키 받음.
		int num1 = Integer.parseInt(str1); //문자열, 숫자로 변환
		System.out.println("입력값 : "+str1);
		
		System.out.println("2숫자를 입력하세요.");
		String str2 = scan.nextLine();
		System.out.println("입력값2 :"+str2);
		
		System.out.println("3숫자를 입력하세요.");
		String str3 = scan.nextLine();
		System.out.println("입력값3 :"+str3);
		
		//합계출력
		System.out.println("합계 : "+num1+str2+str3);
		
		
		
		
//		scan.next();     //문자열로 입력받음 + enter키 입력받지 않음.
//		scan.nextInt();  //정수 숫자로 입력받음 + enter키 입력받지 않음.
//		scan.nextFloat(); //실수 숫자로 입력받음 + enter키 입력받지 않음.

	}

}
