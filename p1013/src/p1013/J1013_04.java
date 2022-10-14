package p1013;

import java.util.Arrays;
import java.util.Scanner;

public class J1013_04 {

	public static void main(String[] args) {
		
		// 5개의 숫자를 입력받아
		// 가장큰수와 가장작은수를 출력하시오.
		// 입력한 숫자 : 7,2,3,4,5
		// 가장 큰 수 : 7
		// 가장 작은 수 : 2
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[7];  // num.length : 10
		int big = 0;
		int small = 0;
		for(int i = 0;i<num.length;i++) {
			System.out.println("숫자를 입력하세요.");
			num[i] = scan.nextInt();
			
			if(i==0) small=num[i];
			
			if(big<num[i]) {
				big = num[i];
			}
			if(small>num[i]) {
				small = num[i];
			}
		}
		
		System.out.print("당신이 입력한 숫자 : ");
		for(int i =0;i<5;i++) {
			System.out.print(num[i]+",");
		}
		System.out.println();
		//num 2,3,7,5,1
		//num 1,2,3,5,7
		Arrays.sort(num);  //7-1
		System.out.println("큰 수 : "+ num[num.length-1]);
		System.out.println("작은 수 : "+ num[0]);
		
		
		
		
		
		// 국어,영어,수학 3명의 점수를 입력받아 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		//변수선언
//		String[] title = {"국어","영어","수학"};
//		int[] kor = new int[3];
//		int[] eng = new int[3];
//		int[] math = new int[3];
//		
//		//성적입력
//		for(int i=0;i<kor.length;i++) { //3번입력
//			System.out.println("국어점수를 입력하세요.");
//			kor[i] = scan.nextInt();
//			System.out.println("영어점수를 입력하세요.");
//			eng[i] = scan.nextInt();
//			System.out.println("수학점수를 입력하세요.");
//			math[i] = scan.nextInt();
//		}
//		
//		
//		// 성적출력
//		System.out.println("[[ 성적출력 ]]");
//		System.out.printf("t국어\t영어\t수학\n");
//		System.out.println("----------------------------------------");
//		for(int i=0;i<kor.length;i++) {
//			System.out.printf("%d\t%d\t%d\n",kor[i],eng[i],math[i]);
//			
//		}
		

	}//main

}//class
