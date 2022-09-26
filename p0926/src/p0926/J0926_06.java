package p0926;

import java.util.Scanner;

public class J0926_06 {

	public static void main(String[] args) {
		
		int number1,kor1,eng1,math1;
		int number2,kor2,eng2,math2;
		String name1,name2;
		int total1,total2;
		double avg1,avg2;
		
		Scanner scan = new Scanner(System.in);
		
		number1 = 1;
		System.out.println("이름 입력 : ");
		name1 = scan.nextLine();
		
		System.out.println("국어점수 입력 : ");
		kor1  = scan.nextInt();
		System.out.println("영어점수 입력 : ");
		eng1  = scan.nextInt();
		System.out.println("수학점수 입력 : ");
		math1  = scan.nextInt();
		scan.nextLine();
		
		number2 = 2;
		System.out.println("이름 입력 : ");
		name2 = scan.nextLine();
		
		System.out.println("국어점수 입력 : ");
		kor2  = scan.nextInt();
		System.out.println("영어점수 입력 : ");
		eng2  = scan.nextInt();
		System.out.println("수학점수 입력 : ");
		math2  = scan.nextInt();
		
		
		// 총점 total - test
		total1 = kor1+eng1+math1;
		total2 = kor2+eng2+math2;
		avg1 = total1 / 3.0;
		avg2 = total2 / 3.0;
		System.out.println("---------------------------------------");
		System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("---------------------------------------");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",number1,name1,kor1,eng1,math1,total1,avg1);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",number2,name2,kor2,eng2,math2,total2,avg2);
		
		// 2명의 데이터를 받아서 출력하시오.
		// 입력은 5개 nextInt,nextLine,nextInt,nextInt,nextInt
		// -------------------------
		// 번호  이름   국어   영어  수학  총점   평균
		// -------------------------
		// 1    홍길동  100   100  99   299   99.67
		// 2    유관순  90    90   99   279   93.37   
		// -------------------------


	}

}
