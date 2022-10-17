package p1013;

import java.util.Scanner;

public class J1013_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수선언
		String[] title = {"이름","국어"};
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		//성적입력
		for(int i=0;i<name.length;i++) { //3번입력
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요.");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math[i] = scan.nextInt();
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i]/3.0;
		}
		
		
		// 성적출력
		System.out.println("[[ 성적출력 ]]");
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("----------------------------------------");
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
			
		}
		
		
		
		

	}

}
