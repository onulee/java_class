package p0930;

import java.util.Scanner;

public class J0930_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2개의 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.nextLine();
		System.out.println("사칙연산을 입력하세요.(+,-,*,/)");
		String str = scan.nextLine();
		
		switch(str){
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		}
		
		
		// 1. 두수를 입력받음 20 10
		// 2. +,-,*,/ 계산방법 -
		
		
		// 3. 해당되는 계산식을 출력하시오.  10
		
		
		
		
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//		
//		switch(score) {
//		case 100: case 99: case 98: case 97: case 96:
//		case 95: case 94: case 93: case 92: case 91: case 90:
//			System.out.println("A");
//			break;
//			
//			
//		}
		
//		if(score>=90) {
//			System.out.println("A");
//		}else if(score>=80) {
//			System.out.println("B");
//		}else if(score>=70) {
//			System.out.println("C");
//		}else if(score>=60) {
//			System.out.println("D");
//		}else{
//			System.out.println("F");
//		}

	}

}
