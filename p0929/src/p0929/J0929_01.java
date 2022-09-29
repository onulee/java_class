package p0929;

import java.util.Scanner;

public class J0929_01 {

	public static void main(String[] args) {
		byte a = 127;
		byte b = (byte)(a + 2);  //129
		System.out.println(b);
		
		char ch = 'a';  //a:97, A:65, 0:48
		int num = ch;  //97
		System.out.println(num);
		
		char ch2 = (char) num;
		
		
		
		
		// String -> char  charAt(0)
		// String -> int   Integer.parseInt
		// int -> String   7 + "" = "7"
		// 숫자char -> int
//		char ch = '3';  //0 : 48 , a : 97, A : 65
//		int result = ch-'0';  // 51-48=3
//		System.out.println(result);
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		//next(),nextLine():문자열,nextInt():정수형,nextDouble():실수형
//		System.out.println("문자를 입력하세요.");
//		String str = scan.next();
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		scan.nextLine();
//		System.out.println("2번째 문자를 입력하세요.");
//		String str2 = scan.nextLine();
//		System.out.println(str+","+num+","+str2);
//		
		
		
//		int a = 10; //정수형 - byte,short,int,long
//		long b = 1000L;
//		long c = 10000000000L;
//		float d = 12.456789F;
//		double e = 12.456789;
//		System.out.println(a);
		
				

	}

}
