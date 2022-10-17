package p1017;

import java.util.Scanner;

public class J1017_01 {

	public static void main(String[] args) {
		// for문 3개의 값을 입력받는 프로그램
		//1.for문
		//2.값을 입력받는다.
//		String[] title = new String[3];
//		title[0]="국어";
//		title[1]="영어";
//		title[2]="수학";
		
		int[] num=new int[3];
		String name = "";
		int total=0;
		double avg = 0;
		String[] title = {"국어","영어","수학"};
		Scanner scan = new Scanner(System.in);
		
		//이름입력
		System.out.println("이름을 입력하세요.>>");
		name = scan.next();
		
		// 점수입력 3번 반복
		for(int i=0;i<3;i++) {  
			System.out.println(title[i]+"점수를 입력하세요.>>"); // 국어점수,영어점수,수학점수를 입력하세요.>>
			num[i] = scan.nextInt(); //점수입력
			total = total + num[i]; //합계
		}
		
		//합계와 평균을 구함.
		avg = (double)total/num.length; //평균
		
		

	}

}
