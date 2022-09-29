package test0929;

import java.util.Scanner;

public class J0929_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("소수점 4자리 반올림해서 값을 출력합니다.");
		double num = scan.nextDouble();
		double result = Math.round(num*1000)/1000.0;
		System.out.println(result);
		
		
		
//		double result = (int)(num*1000)/1000.0;
//		System.out.println(result);
		
//		double num = 3.141592;  //3.141
//		double result = (int)(num*1000)/1000.0;
//		System.out.println(result);
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("영문자를 입력하세요."); //문자 1개
//		String str = scan.nextLine();
//		char input = str.charAt(0);
//		if('a'<=input && input <= 'z' || 'A' <= input && input <= 'Z') {  // 'a'<= x <= 'z'
//			System.out.println("영문자입니다.");
//		}else {
//			System.out.println("영문자만 입력가능합니다.");
//		}
//		
//		System.out.println("입력한 문자 :"+input);
		
		
		
		
//		char ch='a';
//		char ch2 = 'b';
//		char ch3 = (char)(ch + ch2); //int
		
//		int a = 100;
//		float b = 0;
//		b = a;
//		a = (int)b;
		
		
//		float num = 12.003f;
//		int a = (int)num;
//		System.out.println(a);

	}

}
