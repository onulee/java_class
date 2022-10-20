package p1020;

import java.util.Scanner;

public class J1020_03 {

	public static void main(String[] args) {
		
		// 변수,배열 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		int count = 0; //입력된 인원수

		// 프로그램 구성
		loop:
		while (true) {
			// 초기화면 구성
			System.out.println("[ 학생성적 처리 프로그램 ]");
			System.out.println("1. 학생입력");
			System.out.println("2. 학생출력");
			System.out.println("3. 학생점수 수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 종료");
			System.out.println("---------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			// 번호선택 > 프로그램 실행
			switch(choice) {
			case 1:
				System.out.println("[[ 학생성적 입력 ]]");
				if(count>=3) {
					System.out.println("모든 학생을 입력하셨습니다.!!");
					System.out.println();
					break;
				}
				
				// 점수입력 score[3][3]
				loop2:
				for(int i=count;i<3;i++) {
					
					// 이름입력
					System.out.println((count+1)+"번째 이름을 입력하세요.(-1.이전페이지 이동)>>");
					name[count] = scan.next();
					// 0인지 비교 String이므로 equals
					if(name[count].equals("-1")) {
						break;
					}

					// 점수입력
					for(int j=0;j<3;j++) { //j : 0,1,2
						//title "이름","국어","영어","수학","합계","평균","등수"
						System.out.println(title[j+1]+" 점수를 입력하세요.(-1.이전페이지 이동)>>");
						score[i][j] = scan.nextInt();
						if(score[i][j]==-1) {
							break loop2;
						}//if
					}//for
					
					count++; //1명추가
				
				}//for
				
				System.out.println();
				break;
				
			case 0: //종료
				System.out.println("[[ 프로그램 종료 ]]");
				break loop;
			}//switch
			
			
		}//while

		
		
	}//main
}//class
