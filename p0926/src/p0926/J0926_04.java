package p0926;

import java.util.Scanner;

public class J0926_04 {

	public static void main(String[] args) {
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
		
		System.out.print("국어\t영어\t수학\t총점\n");
		System.out.printf("%d\t%d\t%d\t%d\n",num1,num2,num3,num1+num2+num3);
		
//		System.out.println("국어점수 입력 : ");
//		int num1 = scan.nextInt();
//		System.out.println("영어점수 입력 : ");
//		int num2 = scan.nextInt();
//		System.out.println("수학점수 입력 : ");
//		int num3 = scan.nextInt();
//		
//		System.out.print("국어\t영어\t수학\t총점\n");
//		System.out.printf("%d\t%d\t%d\t%d\n",num1,num2,num3,num1+num2+num3);
		

	}

}
