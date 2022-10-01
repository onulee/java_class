package test1001;

import java.util.Scanner;

public class J1001_01 {

	public static void main(String[] args) {
		//점수 90점이상이면 A, 80점 B....CDF
		// int score 점수입력, char 문자
		char grade=' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		//       주석 : 설명문 - 프로그램이랑 상관없음.
		int score = scan.nextInt();
		
		if(score>=90) {
			grade ='A';
		}else if(score >=80) {
			grade ='B'; 
		}else if(score >=70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		
		
		System.out.println("입력점수 :"+score);
		System.out.println("학점 : "+ grade);
		
		

	}

}
