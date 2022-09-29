package p0929;

import java.util.Scanner;

public class J0929_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int score  = scan.nextInt();
		// 0보다 크면 양수, 0이면 0입니다., 0보다 작으면 음수
		if(score>0) {
			System.out.println("양수입니다.");
		}else if(score==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		//조건식이 1개만 필요할때
		if(score>0) {
			
		}
		
		// 조건식이 2개 필요할때
		if(score>0) {
			
		}else {
			
		}
		
//		System.out.println("숫자를 입력해주세요.");
//		int score = scan.nextInt();
//		if(score >=60) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}

	}

}
