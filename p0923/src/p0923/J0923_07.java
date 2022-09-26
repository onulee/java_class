package p0923;

import java.util.Scanner;

public class J0923_07 {

	public static void main(String[] args) {
		// 출력
//		System.out.println(5);
//		System.out.print(5 + "\n");
//		System.out.printf("%d %n",5);
		
		int num;
		num = 100;
		
		String str = new String();
		str = "aaa";
		
		//입력 - console에서 데이터 입력받음
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>>");
		String input = scan.nextLine();  //nextLine() 한줄입력받음
		
		System.out.println("입력한 값 : "+input);
		
		

	}//main
}//class
