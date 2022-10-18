package p1018;

import java.util.Scanner;

public class J1018_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int total=0;
		double avg = 0;
		
		String[] title = {"국어","영어","수학","과학","사회"};
		
		for(int i=0;i<5;i++) {
			System.out.println(title[i]+"점수를 입력하세요.>>");
			score[i] = scan.nextInt();
			//합계
			total = total + score[i];
		}
		
		//평균
		avg = total/5.0;
		
		//출력
		for(int i=0;i<5;i++) {
			System.out.println(score[i]);
		}
		
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+avg);
		
		
		
//		int[] score = new int[10];
//		//1,2,3,4,5.....10
//		//입력
//		for(int i=0;i<10;i++) {
//			score[i]=i+1;  
//		}
//		
//		//출력
//		for(int i=0;i<10;i++) {
//			System.out.println(score[i]);
//		}
		
		
		
//		// 배열
//		int num=0; //1개 변수
//		int num2=0;
//		int[] score = new int[5]; //5개변수
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
//		
//		int[] score2 = {1,2,3,4,5};
//		int[] score3 = new int[] {1,2,3,4,5};
		
		
		
		
	}

}
