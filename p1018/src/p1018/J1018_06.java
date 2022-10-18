package p1018;

import java.util.Scanner;

public class J1018_06 {

	public static void main(String[] args) {
		// 로또프로그램
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] myLotto = new int[6];
		int temp=0;
		int random_num = 0;
		//1. 1-45까지 번호생성
		for(int i=0;i<45;i++) {
			lotto[i]=i+1;
		}
		
		// 2. my로또번호 입력
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요.>>");
			myLotto[i] = scan.nextInt();
		}
		
		
		// 3. 1-45까지 로또번호 섞기
		for(int i=0;i<500;i++) {
			random_num = (int)(Math.random()*45); //0-44
			// 교환
			temp = lotto[0];
			lotto[0]=lotto[random_num];
			lotto[random_num]=temp;
			
		}
		
		// 4. 입력 로또번호 출력
		System.out.print("입력 로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",myLotto[i]);
		}
		System.out.println();
		
		// 5. 당첨 로또번호 출력
		System.out.print("당첨 로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",lotto[i]);
		}
		System.out.println();
		
		
		

	}

}
