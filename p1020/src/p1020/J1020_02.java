package p1020;

import java.util.Scanner;

public class J1020_02 {

	public static void main(String[] args) {
		// 1-25의 1차원 배열에 넣으시오.
		// 배열생성
		int[] num = new int[25];
		int temp = 0;
		int random_num = 0;
		int[][] score = new int[5][5];

		// 배열에 1-25까지 숫자넣기
		for (int i = 0; i < 25; i++) {
			num[i] = i + 1;
		}

		// 번호섞기
		for (int i = 0; i < 500; i++) {
			random_num = (int) (Math.random() * 25);
			temp = num[0];
			num[0] = num[random_num];
			num[random_num] = temp;
		}

		// -----------------------------------------
		// 2차원 배열 num배열 숫자넣기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = num[5 * i + j]; // 0,1,2,3,4,5,6
			}
		}

		Scanner scan = new Scanner(System.in);
		int input = 0;
		//무한반복
		while(true) {
			// 2차원 배열 출력
			System.out.println("               [[ 좌표 게임 ]]");
			System.out.println();
			System.out.printf("번호 |\t0\t1\t2\t3\t4\n");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.printf("%d   |\t", i);
				for (int j = 0; j < 5; j++) {
					System.out.printf("%d\t", score[i][j]);
				}
				System.out.println();
			}
			System.out.println("--------------------------------------------");
			
			
			// 2차원배열에 0표시하기
			System.out.println("1-25까지 숫자를 입력하세요.>>");
			input = scan.nextInt();
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(score[i][j]==input) {
						score[i][j] = 0;
					}
				}
			}
			
			
			
			
			
		}//while
		
		


	}

}
