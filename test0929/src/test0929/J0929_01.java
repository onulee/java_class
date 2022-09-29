package test0929;

import java.util.Scanner;

public class J0929_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //입력을 받기 위한 선언
		// 숫자char -> int   '5'-'0' = int 5
		// int -> String     7+""= String
		// String -> int     Integer.parseInt
		
		int a = 1000000;
		int b = 1000000;
		long c = a * b;
		System.out.println(c);  // 1000000000000;
		
		
		
		
//		System.out.println('9'-'0');
		
		
		
//		String str = scan.nextLine();  // next(),nextLine():문자열 , nextInt():정수형, nextDouble():실수형
//		// str  = "S5"
//		// 5+100
//		char ch =  str.charAt(1); // charAt : String 분리하는 메소드
//		int result = ch-'0';  // char,byte,short 4칙연산 int
//		System.out.println(result+100);
		
		
//		char ch = '3';  //'0':48, '1':49, 'A':65, 'a':97
//		// 숫자문자를 정수형으로 변경하는 방법 ch-'0'= 정수형
//		System.out.println((int)ch);
//		
//		// 문자 '1'을 정수형 1로 변경하시오.
//		System.out.println(ch-'0');
		
		
//		char ch =' ';
//		char ch2 = '\t'; //tab키
//		char ch3 = 'a';
//		char ch4 = 'b';
//		System.out.print(ch3);
//		System.out.print(ch2);
//		System.out.print(ch4);  //ab
//		System.out.println(ch3+ch2+ch4); //a    b

	}

}
