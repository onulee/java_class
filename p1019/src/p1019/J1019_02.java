package p1019;

import java.util.Scanner;

public class J1019_02 {

	public static void main(String[] args) {
		// 크기 3의 배열을 만들고, score 3개를 입력받아 출력하시오.
		// 1. score 크기 3의 배열 생성
		// 2. score 숫자 입력
		// 3. score배열 출력
		int[] score = new int[3];
		String name = "";
		int total = 0;
		double avg = 0;
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		Scanner scan = new Scanner(System.in);

		// 데이터 입력부분
		System.out.println("이름을 입력하세요.>>");
		name = scan.next();

		for (int i = 0; i < 3; i++) {
			System.out.println("점수를 입력하세요.>>");
			score[i] = scan.nextInt();
			//total = total + score[i];
		}

		// 합계,평균 계산 total,avg
		total = score[0]+score[1]+score[2];
		avg = total/3.0;

		// 데이터 출력부분
		for (int i = 0; i < 6; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------");

		System.out.printf("%s\t", name);
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d\t", score[i]);
		}
		// 합계,평균 출력 total,avg
		System.out.printf("%d\t%.2f\n",total,avg);



	}

}
