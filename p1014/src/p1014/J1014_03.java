package p1014;

import java.util.Scanner;

public class J1014_03 {

	public static void main(String[] args) {
		// Math.random()
		// 1-100까지 랜덤숫자 10개를 배열에 저장해서 출력하시오.
		// 1. 1-100까지 랜덤숫자 1개를 출력해보세요.
		int[] num = new int[10];
		int[] input = new int[10];
		int count = 0;
		Scanner scan = new Scanner(System.in);

		// 랜덤숫자 10개
		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		// 랜덤숫자 출력
		System.out.println("랜덤숫자 : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		
		// 1-100까지 숫자10개를 Scannner입력받으시오.
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			input[i] = scan.nextInt();
		}

		

		// 입력숫자 출력
		System.out.println("입력숫자 : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();

		// num[0] == input[0] 비교해서
		// num[1] == input[1] 비교해서
		// num[2] == input[2] 비교해서
		// ...
		// num[9] == input[9] 비교해서
		
		// 맞으면 count++, 틀리면 그대로
		// count출력하시오.
		
		// 숙제. 
		// num[0] -> input[0],[1],[2]....[9]
		// num[1] -> input[0],[1],[2]....[9]
		// num[2] -> input[0],[1],[2]....[9]
		// ...
		// num[9] -> input[0],[1],[2]....[9]
		for(int i=0;i<10;i++) {
			if(num[i]==input[i]) {
				count++;
			}
		}//
		
		System.out.println("맞는 개수 : "+count);

	}//main

}//class
