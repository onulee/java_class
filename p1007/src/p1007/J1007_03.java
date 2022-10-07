package p1007;

import java.util.Scanner;

public class J1007_03 {

	public static void main(String[] args) {
		
		//배열5개에 5개의 숫자를 직접입력해서 저장하고 출력하시오.
		int[] score = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			
			score[i] = scan.nextInt();
			System.out.println("숫자 : "+score[i]);
		}
		
		
//		int[] score = new int[10];
//		for(int i=0;i<10;i++) {
//			score[i] = i;
//		}
		
		
		
		// 1-100까지 랜덤숫자를 1개 출력하시오. 0.0 <= Math.random() < 1.0
		// 1-1000  0-999
		// 0+1 <= x < 100+1
		// 2-100
		// 0.0*99+2 <= (int)(Math.random()*99)+2 < 1.0*99+2
//		int input = (int)(Math.random()*100)+1;
//		
//		//랜덤숫자 1-100, 10개를 배열에 넣고 출력하시오.
//		int[] score = new int[10];
//		
//		for(int i=0;i<10;i++) {
//			score[i] = (int)(Math.random()*100)+1;  
//			// 0 = 0, 1 = 1
//			System.out.println(score[i]);
//		}
//		
//		
//		
//		System.out.println(input);
		
		
		
		
		

	}

}
