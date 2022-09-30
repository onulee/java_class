package test0930;

import java.util.Scanner;

public class J0930_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int result = (a>=b)?a:b;
		System.out.println(result);
		
//		Scanner scan = new Scanner(System.in);
//		// 880101-1101111, 020101-4101111  1,3:남자 2,4:여자 
//		System.out.println("주민번호를 입력받아 여자인지 남자인지 출력하시오.");
//		String str = scan.nextLine();
//		int num = str.charAt(7)-'0'; //문자를 숫자로 변경 '2'-'0'
//		if(num==1 || num==3) {
//			System.out.println("남자입니다.");
//		}else {
//			System.out.println("여자입니다.");
//		}
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		if(num%2==0) {
//			System.out.println("짝수입니다.2의 배수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
		
		
		// 1.789456 5자리에서 반올림 하시오.
		// Math.round():반올림, Math.floor():버림, Math.ceil():올림
//		double pi = 1.789456;
//		double result = Math.round(pi*10000)/10000.0;  //17894.56
//		System.out.println(result); //
		
		
		
		//3자리에서 반올림
//		double pi = 3.14789;
//		// Math.round() 소수점 첫째자리에서 반올림
//		double result = Math.round(pi*100)/100.0;
//		System.out.println(result); //3.15
		
		
		
		// 소수점 3자리 이하 절사 5자리 이하 절사
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		System.out.println(result);
		

	}

}
