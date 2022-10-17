package p1017;

import java.util.Scanner;

public class J1017_02 {

	public static void main(String[] args) {
		// 입력한 숫자를 출력하는 무한반복 프로그램
		String choice="";
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력하세요.(영문소문자 입력시 종료)>>");
			choice = scan.next(); //문자열입력
			if(choice.charAt(0)>='a' && choice.charAt(0)<='z') { // a,b,c,d,e ...   ,x,y,z
				System.out.println("프로그램 종료");
				break;
			}
			else
				System.out.println(choice); // 0번 종료
			
		}
		
		
		// 1-100까지 3의 배수만 출력하시오.
//		for(int i=1;i<=100;i++) {
//			if(i%3==0 || i%7==0)
//				System.out.println(i);
//		}

	}

}
