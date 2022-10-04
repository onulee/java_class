package p1004;

import java.util.Scanner;

public class J1004_02 {

	public static void main(String[] args) {
		
		// 1부터 입력한 값까지 합계를 구하는 프로그램을 구성하시오.
		// 10입력하면 1,10까지 합을 출력 55
		// 100입력하면 5050
		Scanner scan  = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int input = scan.nextInt();
		int sum = 0;
		
		for(int i=1;i<=input;i++) {
			sum = sum + i;
		}
		
		System.out.println("합계 : "+sum);
		
		// 1+1=2, 2+3=5, 3+5=8
		// i는 1부터 1씩 증가
		// j는 1부터 2씩 증가해서.... 합을 출력하시오.
//		int sum = 0;
//		for(int i=1,j=1;i<=10;i++,j=j+2) {
//			sum = sum + (i+j);
//			System.out.println(i+j);
//		}
//		System.out.println(sum);
		
		
//		for(int i=10;i>=1;i--) {
//			System.out.println(i);
//		}
//		
//		j = j+2, j +=2
//		for(int i=1,j=10;i<=10;i++,j--) {
//			System.out.println(i+","+j);
//		}
		
		
		
		// a~z -> char ch ='a'
		// for문을 26번 실행해서 abcde 출력하시오.
//		Scanner scan  = new Scanner(System.in);
////		String input = scan.next(); //nextLine(),nextInt(),nextDouble()
////		char num = input.charAt(0);
//		
//		char num = scan.next().charAt(0);
//		
//		char ch = 'a';
////		System.out.println('z'-'a'+1); //26
////		System.out.print(ch);
//		for(int i=0;i<num-'a'+1;i++) {
//			System.out.print(ch++);
//		}
		
		
		//for문을 사용하는 방법과 for문을 사용하지 않는 방법
		// for문을 사용하지 않는 방법
		// input1,input2,input3 3개를 출력, 합계 출력하시오.
//		Scanner scan  = new Scanner(System.in);
//		int sum = 0;
//		for(int i=0;i<3;i++) {
//			System.out.println("숫자를 입력하세요.");
//			int input1 = scan.nextInt();
//			System.out.println(input1);
//			sum = sum + input1;
//			
//		}
//		System.out.println("합계 : "+sum);
		
		
//		Scanner scan  = new Scanner(System.in);
//		int sum = 0;
//		System.out.println("숫자를 입력하세요.");
//		int input1 = scan.nextInt();
//		System.out.println(input1);
//		System.out.println("숫자를 입력하세요.");
//		int input2 = scan.nextInt();
//		System.out.println(input2);
//		System.out.println("숫자를 입력하세요.");
//		int input3 = scan.nextInt();
//		System.out.println(input3);
//		sum = input1+input2+input3;
//		System.out.println("합계 : "+sum);
		
		
		// 숫자 10개를 입력받아 합계를 구하는 프로그램을 구성하시오.
		// for문 사용
//		Scanner scan  = new Scanner(System.in);
//		int input = 0;
//		int sum = 0;
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("숫자를 입력하세요.");
//			input = scan.nextInt();
//			sum = sum + input; //합계
//			System.out.println(input);
//		}
//		System.out.println(sum);
		
		
		// 1-5까지 숫자를 출력하시오.
//		for(int i=1;i<=5;i++) {
//			System.out.println(i);
//		}

	}

}
