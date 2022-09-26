package p0926;

import java.util.Scanner;

public class J0926_03 {

	public static void main(String[] args) {
		// 이름 : 홍길동 nextLine
		// 나이 : 20   nextInt
		// 전화번호 : 010-1111-1111  nextLine
		// 숫자 : 12.123456789 -> 소수점 2자리까지 출력
		// 숫자 : 12.12 - nextDouble
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("이름을 입력하세요.\n");
		String name = scan.nextLine();
		System.out.printf("이름 : %s \n",name);
		
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("나이 : "+age);

		System.out.println("전화번호를 입력하세요.");
		String tel = scan.nextLine();
		System.out.println("전화번호 : "+tel);
		
		System.out.println("숫자를 입력하세요.");
		double num = scan.nextDouble();
		System.out.println("숫자 : "+ num);
		// printf  
		// %d - 정수:int,long , %f - 실수:float,double
		// %s - 문자열 , %c - 문자
		System.out.printf("숫자 : %.2f",num);
			

	}

}
