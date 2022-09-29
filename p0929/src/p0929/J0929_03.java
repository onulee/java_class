package p0929;

import java.util.Scanner;

public class J0929_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// x,X가 입력되면 프로그램을 종료합니다., 프로그램을 실행합니다.
		System.out.println("문자를 입력해주세요.");
		String input = scan.nextLine();
//		int input2 = scan.nextInt();
		// String -> char1개를 가져오는 메소드 c
		char ch = input.charAt(0);
		// 0-9까지의 숫자가 입력되면 숫자입니다. 숫자만 입력이 가능합니다.
		if('0'<=ch && ch<='9') {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		
		
		
		
		
		// 영문자를 입력하면 영문자입니다., 영문자를 입력하셔야 합니다.
		// 'a'<= ch <='z'   'A'<= ch <= 'Z'
//		if('a'<=ch && ch<='z' || 'A'<=ch && ch<='Z') {
//			System.out.println("영문자입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}
		
		
		
//		if(ch=='x' || ch=='X') {
//			System.out.println("프로그램을 종료합니다.");
//		}else {
//			System.out.println("프로그램을 실행합니다.");
//		}
		
		
		
		
//		System.out.println("점수를 입력하세요.");
//		int score  = scan.nextInt();
//		if(score>= 90) {
//			System.out.println("학점 : A");
//		}else if(score>=80) {    // 80<= score < 90
//			System.out.println("학점 : B");
//		}else if(score>=70) {
//			System.out.println("학점 : C");
//		}else if(score>=60) {
//			System.out.println("학점 : D");
//		}else {
//			System.out.println("학점 : F");
//		}

	}

}
