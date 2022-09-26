package p0926;

import java.util.Scanner;

public class J0926_05 {

	public static void main(String[] args) {
		// -------------------------
		// 국어   영어  수학  총점   평균
		// -------------------------
		// 100   100  99   299   소수점2자리까지출력
		// -------------------------
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		String input1 = scan.nextLine();
		int num1 = Integer.parseInt(input1);
		
		System.out.println("영어점수 입력 : ");
		String input2 = scan.nextLine();
		int num2 = Integer.parseInt(input2);
		
		System.out.println("수학점수 입력 : ");
		String input3 = scan.nextLine();
		int num3 = Integer.parseInt(input3);
		// 총점 total - test
		int total = num1+num2+num3;
		double avg = (num1+num2+num3)/3.0;
		System.out.println("---------------------------------------");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		System.out.println("---------------------------------------");
		System.out.printf("%d\t%d\t%d\t%d\t%.2f\n",num1,num2,num3,total,avg);
		

	}

}
