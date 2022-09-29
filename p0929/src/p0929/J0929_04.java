package p0929;

import java.util.Scanner;

public class J0929_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score  = scan.nextInt();
		if(score>= 90) {
			// 100,99,98 : A+, 97,96,95,94: A, 93,92,91,90 :A-
			System.out.print("A");  //A
			if(score>=98) {
				System.out.println("+");
			}else if(score<=93) {
				System.out.println("-");
			}
			
//			if(score>=98) {
//				System.out.println("A+");
//			}else if(score >=94) {
//				System.out.println("A");
//			}else {
//				System.out.println("A-");
//			}
			System.out.println();
		}else if(score>=80) {    // 80<= score < 90
			System.out.println("학점 : B");
		}else if(score>=70) {
			System.out.println("학점 : C");
		}else if(score>=60) {
			System.out.println("학점 : D");
		}else {
			System.out.println("학점 : F");
		}

	}

}
