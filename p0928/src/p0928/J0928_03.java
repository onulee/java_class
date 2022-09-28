package p0928;

import java.util.Scanner;

public class J0928_03 {

	public static void main(String[] args) {
		// 숫자char->int  '9'-'0'=int
		// String->int   Integer.parseInt
		// int->String   7+""="7"
		
		Scanner scan = new Scanner(System.in);
		// A4이하-일반좌석 ,A5번이상은 VIP전용 - 음료수가 공짜, A1,2,3,4  5,6,7,8,9
		System.out.println("영화관 좌석을 입력하세요.예)A3");
		String str = scan.nextLine();
		System.out.println(str.charAt(0)); // charAt:문자열을 순서대로 문자로 변환
		System.out.println((str.charAt(1)-'0'));  //char타입 숫자char->int  '9'-'0'=int
		if((str.charAt(1)-'0') >= 5)
			System.out.println("VIP좌석입니다. 음료수를 무료로 제공합니다.");
		else
			System.out.println("일반좌석입니다. 재미있는 관람하세요.");
		
		// str.charAt(1):char 5보다 크냐?
		// 5보다 큰지 비교해서 크다, 작다 출력해보세요.
		
		
		
		
		
//		char num = '9';  //'0'=48,49,50,51,52,53,54,55,56,57
//		System.out.println((int)num);
//		
//		char zero='0';
//		int result = num-zero;  //'9'-'0'
//		System.out.println(result);
		

	}

}
