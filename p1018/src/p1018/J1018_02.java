package p1018;

import java.util.Scanner;

public class J1018_02 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		int choice=0;
		
		loop:
		while(true) {
			System.out.println("[ 성적관리 프로그램 ]");
			System.out.println("1.성적입력");
			System.out.println("2.성적수정");
			System.out.println("3.학생검색");
			System.out.println("4.등수처리");
			System.out.println("5.성적출력");
			System.out.println("0.프로그램종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			//비교 switch
			switch(choice) {
			
			case 1:
				System.out.println("[[ 성적입력 ]]");
				break;
			case 2:
				System.out.println("[[ 성적수정 ]]");
				break;
			case 3:
				System.out.println("[[ 학생검색 ]]");
				break;
				
				
			case 0:
				System.out.println("[[프로그램 종료]]");
				break loop; //switch
			}
			
			
		}//while

	}//main

}//class
