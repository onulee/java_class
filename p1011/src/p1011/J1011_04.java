package p1011;

import java.util.Scanner;

public class J1011_04 {

	public static void main(String[] args) {
		// 1.성적입력
		// 2.성적수정
		// 3.성적출력
		// 0.종료
		Scanner scan = new Scanner(System.in);
		int choice=0;
		int kor=0,eng=0,math=0,total=0;
		String name="";
		double avg=0;
		
		
		loop:  // 무한반복 : while 이름설정- loop
		while(true) {
			System.out.println("[ 성적처리 프로그램 ]");
			System.out.println("1.성적입력");
			System.out.println("2.성적수정");
			System.out.println("3.성적출력");
			System.out.println("0.종료");
			System.out.println("----------");
			System.out.println("원하는 번호를 선택하세요>>");
			choice = scan.nextInt();
			scan.nextLine();
			System.out.println("입력 번호 : "+choice);
			
			switch(choice) {
			case 1:
				System.out.println("[[ 성적입력 ]]");
				System.out.println("이름을 입력하세요.");
				name = scan.nextLine();
				System.out.println("국어 점수를 입력하세요.");
				kor = scan.nextInt();
				System.out.println("영어 점수를 입력하세요.");
				eng = scan.nextInt();
				System.out.println("수학 점수를 입력하세요.");
				math = scan.nextInt();
				
				total = kor+eng+math;
				avg = total/3.0;
				System.out.println("성적입력이 완료되었습니다.");
				System.out.println();
				break;
			case 2:
				System.out.println("[[ 성적 수정 ]]");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.println("0. 성적입력 취소");
				System.out.println("------------");
				System.out.println("수정할 과목을 선택하세요.>>");
				choice = scan.nextInt();
				//switch구문
				switch (choice) {
				case 1:
					System.out.println("[[[ 국어 성적수정 ]]]");
					//프로그램
					System.out.println("현재 국어점수 : "+kor);
					System.out.println("변경할 점수를 입력하세요.>>");
					kor = scan.nextInt();
					total = kor+eng+math;
					avg = total/3.0;
					System.out.println("변경 국어점수 : "+kor);
					System.out.println();
					break;
				case 2:
					System.out.println("[[[ 영어 성적수정 ]]]");
					//프로그램
					
					break;
				case 3:
					System.out.println("[[[ 수학 성적수정 ]]]");
					//프로그램
					
					break;

				case 0:
					System.out.println("[[[ 이전화면으로 이동 ]]]");
					System.out.println();
					break;
				}
				
				
				System.out.println();
				break;
			case 3:
				System.out.println("[[ 성적 출력 ]]");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,total,avg);
				System.out.println();
				break;
			case 0:
				System.out.println("[[ 프로그램 종료]] ");
				System.out.println();
				break loop;
			}//switch
			
		}//while

	}//main

}//class
