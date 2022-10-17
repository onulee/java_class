package p1017;

import java.util.Scanner;

public class J1017_03_문자열숫자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice ="";
		char ch=' ',ch2 =' ';
		int num=0,num2=0;
		
		System.out.println("2자리 숫자를 입력하세요.(예:27)>>"); //// 27 -> 2+7=9, 35 -> 3+5=8
		choice = scan.next();        // String -> charAt() -> '0'
		ch = choice.charAt(0);      //2    /num = Integer.parseInt(choice);  //27
		ch2 = choice.charAt(1);     //7
		
		System.out.println(ch);     // ascii코드 0:48 1:49 :2:50...
		System.out.println(ch2);
		System.out.println("더하기 : "+(ch+ch2)); //99
		
		num = ch-'0';
		num2 = ch2-'0';
		
		System.out.println("더하기 : "+(num+num2)); //3
		
		
		
//		int choice = 0;
//		System.out.println("숫자를 입력하세요.");
//		choice = scan.nextInt();
//		if(choice != 3) {
//			System.out.println("제대로 입력했습니다.");
//		}else {
//			System.out.println("잘못입력했습니다.");
//		}
		
		
		
		
		
		
//		String choice ="";
//		System.out.println("yes를 입력하세요.>>");
//		choice = scan.next();
//		if(choice.equals("yes")||choice.equals("Yes")) { //객체 비교시
////			if(choice.equalsIgnoreCase(choice)) { //객체 비교시
//			System.out.println("yes가 입력되었습니다.");
//		}else {
//			System.out.println("yes가 입력되지 않았습니다.");
//		}

	}

}
