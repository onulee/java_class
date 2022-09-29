package p0929;

import java.util.Scanner;

public class J0929_05 {

	public static void main(String[] args) {
		// println, print, printf
		// 국어,영어점수를 입력받아 합계, 평균을 구하고
		// 평균이 90점이상 A, 80점이상 B,C,D,F 출력하시오.
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int total = kor + eng+math;
		double avg = total/3.0;  // int + int = int, int + double = double
		String grade="";
		if(avg>= 90) {
			grade = "A";
		}else if(avg>=80) {    // 80<= score < 90
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else if(avg>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("국어\t영어\t수학\t합계\t평균\t학점");
		System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n",kor,eng,math,total,avg,grade);
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+grade);
		
		

	}

}
