package p1012;

import java.util.Scanner;

public class J1012_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[100];
		int i=0;
		int choice=0;
		loop:
		while(true) {
			System.out.println("1.학생입력");
			System.out.println("0.종료");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				while(true) {
					System.out.println("이름을 입력하세요.(0.이전페이지 이동)");
					name[i] = scan.next();
					if(name[i].charAt(0)=='0') {  //String -> name[i].equals("0")
						System.out.println("이전페이지 이동합니다.!!");
						System.out.println();
						break;
					}
					i++;
				}
				break;
			case 0:
				System.out.println("[[ 프로그램 종료 ]]");
				break loop;
			}
			
		}
		
		
		
		
		
		//1-10까지 배열을 생성해서 숫자를 출력하시오.
//		int[] num = {1,2,3,6,2,0,4,5,7};
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
		
		
//		String str ="abcde";
//		System.out.println(str.length());
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		String[] name = new String[10];
//		int[] kor = new int[10];
//		
//		for(int i=0;i<3;i++) {
//			System.out.println("이름을 입력하세요.>>");
//			name[i] = scan.next();
//			System.out.println("국어점수를 입력하세요.>>");
//			kor[i] = scan.nextInt();
//		}
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(name[i]+","+kor[i]);
//			System.out.printf("이름 : %s\t국어:%d\n",name[i],kor[i]);
//		}
		
		
		
//		String name="",name2="",name3="",name4="",name5="";
//		
//		System.out.println("이름을 입력하세요.>>");
//		name = scan.next();
//		System.out.println("이름을 입력하세요.>>");
//		name2 = scan.next();
//		System.out.println("이름을 입력하세요.>>");
//		name3 = scan.next();
//		System.out.println("이름을 입력하세요.>>");
//		name4 = scan.next();
//		System.out.println("이름을 입력하세요.>>");
//		name5 = scan.next();
//		
//		System.out.println(name);
//		System.out.println(name2);
//		System.out.println(name3);
//		System.out.println(name4);
//		System.out.println(name5);
//		
		
		
		
		// 10개를 만들어서 1-10까지 넣기
//		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		score[6] = 7;
//		score[7] = 8;
//		score[8] = 9;
//		score[9] = 10;
//		
//		int[] score2 = {1,2,3,4,5,6,7,8,9,10};
//		
//		int[] score3 = new int[100];
//		for(int i=0;i<100;i++) {
//			score3[i] = i+1;
//			System.out.println(score3[i]);
//		}
		

	}//main

}//class
