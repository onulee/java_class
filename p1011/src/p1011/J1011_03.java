package p1011;

import java.util.Scanner;

public class J1011_03 {

	public static void main(String[] args) {
		// 점수2개를 입력받아 평균을 내서 kor,eng
		// 평균에 맞는 학점을 출력하시오. 90:A, 80:B, 70:C, 70점미만:F
		int kor=0,eng=0,math=0,total=0;
		double avg=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = scan.nextInt();
		
		total = kor+eng+math;
		avg = total/3.0;
		
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}

	}

}
