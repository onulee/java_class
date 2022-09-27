package p0927;

import java.util.Scanner;

public class J0927_03 {

	public static void main(String[] args) {
		// 입력값의 1의 감소값과 1 증가값을 출력하시오.
		Scanner scan = new Scanner(System.in);
		// 1개의 입력을 받음
		System.out.println("숫자를 입력하세요.");
		String result = scan.nextLine();
		int num = Integer.parseInt(result);
		int num2 = num + 1;  // ++num  
		int num3 = num - 1;  // --num
		System.out.println("입력값 : "+num);
		System.out.println("1증가값 :"+num2);
		System.out.println("1감소값 :"+num3);

	}

}
