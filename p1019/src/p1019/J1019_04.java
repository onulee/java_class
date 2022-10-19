package p1019;

import java.util.Scanner;

public class J1019_04 {

	public static void main(String[] args) {
		// 5,5의 배열 생성, 1~25 숫자를 랜덤으로 입력해서  5X5배열로 출력하시오.
		int[] num = new int[25];
		int[][] score = new int[5][5];
		int temp=0;
		int random_num=0;
		
		// num배열 번호넣기
		for(int i=0;i<25;i++) {
			num[i] = i+1;
		}
		
		// num배열 번호섞기
		for(int i=0;i<500;i++) {
			random_num = (int)(Math.random()*25); //0-24
			temp = num[0];
			num[0] = num[random_num];
			num[random_num] = temp;
		}
		
		// num배열 번호출력
//		for(int i=0;i<25;i++) {
//			System.out.printf("%d\t",num[i]);
//		}
//		System.out.println();
		
		// 2차원 score배열 번호넣기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				score[i][j] = num[5*i+j];  //1,2,3,4,5,6,7,8,9
			}
		}//for
		
		//무한반복
		while(true) {
			
			//번호입력
			Scanner scan = new Scanner(System.in);
			int input1=0;
			int input2=0;
			System.out.println("좌표를 입력하세요.>>");
			input1 = scan.nextInt();
			input2 = scan.nextInt();
			
			System.out.printf("좌표 : %d,%d \n",input1,input2); //3,3
			
			// 2차원 score배열 변경
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++) {
					if(i==input1 && j==input2) {
						score[i][j] = 0; 
					}//if
				}//for
			}//for
			System.out.println();
			
			// 2차원 score배열 출력 
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++) {
						System.out.printf("%d\t",score[i][j]);
				}//for
				System.out.println();
			}//for
			
		}
		
		
		

	}//main

}//class
