package p0928;

import java.util.Scanner;

public class J0928_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("프로그램을 종료할까요?(X,x:프로그램종료)");
		
		// 기본형타입(boolean,char,byte,short,int,long,float,double) : ==
		// 참조형타입(클래스타입): equals
	    String str = scan.nextLine();
	    if ( str.equalsIgnoreCase("x") ) //대소문자 구분없이 알파벳 비교
	    	System.out.println("프로그램을 종료합니다.");
	    else
	    	System.out.println("프로그램을 실행합니다.");
	    
//	    if ( str.equals("X") || str.equals("x") )
//	    	System.out.println("프로그램을 종료합니다.");
//	    else
//	    	System.out.println("프로그램을 실행합니다.");
		

		// 숫자 0을 입력하면 프로그램 종료
//		int num = scan.nextInt();
////		String str = scan.nextLine();
////		int num = Integer.parseInt(str);
//		if( num == 0)
//			System.out.println("프로그램을 종료합니다.");
//		else
//			System.out.println("프로그램을 실행합니다.");
		
		
		// 문자 X를 입력하면 프로그램 종료
//		String str = scan.nextLine();
//		if( str.charAt(0) == 'X' || str.charAt(0) == 'x')
//			System.out.println("프로그램을 종료합니다.");
//		else
//			System.out.println("프로그램을 실행합니다.");
				

	}

}
