package p1006;

import java.util.Scanner;

public class J1006_06 {

	public static void main(String[] args) {
		// 1명의 학생성적프로그램을 구현하시오.
		// 이름,국어,영어,수학성적을 입력받아, 합계,평균을 출력하시오.
		// 이름  국어  영어  수학  합계  평균
		// 홍길동 100  100  99   299  99.67
		Scanner scan = new Scanner(System.in);
		String name1="";
		int kor1=0,eng1=0,math1=0;
		int total1=0,total2=0;
		double avg1=0,avg2=0;
		int choice=0;
		
		System.out.println("[ 성적처리 프로그램 ]");
		loop1:
		while(true) {
			System.out.println("1. 성적입력");
			System.out.println("2. 성적수정");
			System.out.println("3. 성적출력");
			System.out.println("원하는 번호를 입력하세요.(0.종료)");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println(" [[ 성적입력 선택 ]]");
				System.out.println("이름 입력 : ");
				name1 = scan.nextLine();
				
				System.out.println("국어점수 입력 : ");
				kor1  = scan.nextInt();
				System.out.println("영어점수 입력 : ");
				eng1  = scan.nextInt();
				System.out.println("수학점수 입력 : ");
				math1  = scan.nextInt();
				scan.nextLine();
				total1 = kor1+eng1+math1;
				avg1 = total1 / 3.0;
				
				System.out.println("성적입력이 완료되었습니다.!!");
				System.out.println();
				break;
			case 2:
				System.out.println("[[ 성적수정 선택 ]]");
				System.out.println("무슨과목을 수정하시겠습니까?(0.이전페이지 이동)");
				System.out.println("1.국어  2.영어  3.수학 0.이전페이지이동");
				System.out.println("원하는 번호를 선택하세요.");
				choice = scan.nextInt();
				scan.nextLine();
				
				switch(choice) {
				case 1:
					System.out.println("[[[ 국어 수정 ]]]");
					System.out.println("현재 국어점수 : "+kor1);
					System.out.println("변경할 점수 입력 :");
					kor1 = scan.nextInt();
					scan.nextLine();
					total1 = kor1+eng1+math1;
					avg1 = total1 / 3.0;
					System.out.println(kor1 + "으로 국어점수가 수정되었습니다.!!");
					System.out.println();
					break;
				}
				break;
			case 3:
				System.out.println("[[ 성적출력 선택 ]]");
				System.out.println("------------------------------------------");
				System.out.print("이름\t국어\t영어\t수학\t총점\t평균\n");
				System.out.println("------------------------------------------");
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name1,kor1,eng1,math1,total1,avg1);
				System.out.println("------------------------------------------");
				break;
			case 0:
				System.out.println("프로그램 종료.");
				break loop1;
			}
		}
		
		
	}

}
