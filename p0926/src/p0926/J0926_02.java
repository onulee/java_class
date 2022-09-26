package p0926;

import java.util.Scanner;

public class J0926_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String input = scan.nextLine(); //10
		int num = Integer.parseInt(input); //문자열->숫자
		System.out.println("두번째 숫자를 입력하세요.");
		String input2 = scan.nextLine();
		int num2 = Integer.parseInt(input2);
		System.out.print("두수의 합 : "); //20
		System.out.println(num+num2);
		
		

	}

}
