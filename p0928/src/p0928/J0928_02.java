package p0928;

import java.util.Scanner;

public class J0928_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int y = 10;
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		if(num >= y)
//			System.out.println("입력한 숫자는 10보다 같거나 크다");
//		else
//			System.out.println("입력한 숫자는 10보다 작다");
		
		
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		if(num%2 == 0)
			System.out.println("짝수입니다.");
		else	
			System.out.println("홀수입니다.");
			
		
		// 입력한 숫자가 짝수입니다.
		// 입력한 숫자가 홀수입니다.
		
//		System.out.println("2로 나눈 나머지 : "+(num%2));

	}

}
