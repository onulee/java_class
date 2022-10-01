package test1001;

import java.util.Scanner;

public class J1001_05 {

	public static void main(String[] args) {
		// 학생성적프로그램
		//println, print, printf
		int total=0;
		double avg=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scan.next(); //nextLine()
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt(); // next(),nextLine(),nextInt(),nextDouble()
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		total = kor + eng + math;
		avg = total/3.0;
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,total,avg);
		
//	    System.out.println("이름 :"+name);
//	    System.out.println("국어점수 :"+kor);
//	    System.out.println("영어점수 :"+eng);
//	    System.out.println("수학점수 :"+math);
//	    System.out.println("합계 :"+total);
//	    System.out.printf("평균 : %.2f",total/3.0);
		
		
		
		
//		System.out.println(10/3.0);
//		System.out.printf("%6.1f\n%s",1000/3.0,"문자열");   //%d:정수, %f:실수, %s:문자열, %c:문자

	}

}
