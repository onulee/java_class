package p1012;

import java.util.Scanner;

public class J1012_03 {

	public static void main(String[] args) {
		// 1.성적입력
		// 2.성적수정
		// 3.성적출력
		// 0.종료
		int choice=0;
		String name = "";
		int kor=0,eng=0,math=0,total=0;
		double avg = 0;
		Scanner scan = new Scanner(System.in);
		
		loop:
		while(true) {
			System.out.println("[ 성적처리 프로그램 ]");
			System.out.println("1.성적입력");
			System.out.println("2.성적수정");
			System.out.println("3.성적출력");
			System.out.println("0.종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[[ 성적입력 ]]");
				
				// 이름,국어,영어,수학 -> 합계,평균
				System.out.println("이름을 입력하세요.>>");
				name = scan.next(); // nextLine() -> 홍 길동
				System.out.println("국어점수를 입력하세요.>>");
				kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요.>>");
				eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요.>>");
				math = scan.nextInt();
				
				total = kor + eng + math;
				avg = total/3.0;
				
				System.out.println("입력이 완료되었습니다!!");
				System.out.println();
				break;
				
			case 2:
				System.out.println("[[ 성적수정 ]]");
				System.out.println("1.국어");
				System.out.println("2.영어");
				System.out.println("3.수학");
				System.out.println("0.이전페이지 이동");
				System.out.println("----------------");
				System.out.println("원하는 번호를 입력하세요.>>");
				choice = scan.nextInt();
				switch(choice) {
				case 1:
					System.out.println("[[[ 국어점수 수정 ]]]");
					System.out.println("현재 국어점수 : "+kor); 
					System.out.println("변경할 점수를 입력하세요.>>");
					kor = scan.nextInt();
					total = kor+eng+math;
					avg = total/3.0;
					System.out.println(kor + "점으로 변경되었습니다!!");
					System.out.println();
					break;
				case 2:
					System.out.println("[[[ 영어점수 수정 ]]]");
					System.out.println("현재 영어점수 : "+eng); 
					System.out.println("변경할 점수를 입력하세요.>>");
					eng = scan.nextInt();
					total = kor+eng+math;
					avg = total/3.0;
					System.out.println(eng + "점으로 변경되었습니다!!");
					System.out.println();
					break;
				case 3:
					System.out.println("[[[ 수학점수 수정 ]]]");
					System.out.println("현재 수학점수 : "+math); 
					System.out.println("변경할 점수를 입력하세요.>>");
					math = scan.nextInt();
					total = kor+eng+math;
					avg = total/3.0;
					System.out.println(math + "점으로 변경되었습니다!!");
					System.out.println();
					break;
				
				case 0:
					System.out.println("이전페이지 이동!!");
					System.out.println();
					break;
				
				}//switch
				break;
				
			case 3:
				System.out.println("[[ 성적출력 ]]");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("----------------------------------------");
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,total,avg);
				System.out.println();
				break;
			
			
			case 0:
				System.out.println("▶▶▶ 프로그램 종료");
				break loop;
			
			}//switch
			
			
			
			
		}//while
	}//main
}//class
